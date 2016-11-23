package com.spring.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Item;
import com.spring.model.Category;
import com.spring.services.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	@RequestMapping("/getAllItems")
	public ModelAndView getAllProducts(){
		List<Item> items = itemService.getAllItems();
		return new ModelAndView("SportItemList","items",items);
	}
	@RequestMapping("getItemByIsbn/{isbn}")
	public ModelAndView getItemByIsbn(@PathVariable(value="isbn") int isbn){
		Item b=itemService.getItemByIsbn(isbn);
		return new ModelAndView("SportItemPage","itemObj",b);
	}
	@RequestMapping(value="/delete/{isbn}")
	public String deleteItem(@PathVariable(value="isbn") int isbn){
		Path path=Paths.get("C:/Users/Ankur/workspace/SportShop/src/main/webapp/WEB-INF/resources/images/" + isbn + ".jpg");
		if(Files.exists(path))
				{
			           try {
						Files.delete(path);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		itemService.deleteItem(isbn);
		
		return "redirect:/getAllItems";
	}

	@RequestMapping(value="/addItem",method=RequestMethod.GET)
	public String getSportItemForm(Model model){
		Item item=new Item();
		Category category=new Category();
		category.setCid(1);//New Arrivals
		//set the category as 1 for the Book book
		item.setCategory(category);
		model.addAttribute("SportItemFormObj",item);
		return "SportItemForm";
	}
	@RequestMapping(value="/addItem",method=RequestMethod.POST)
	public String addItem( @Valid @ModelAttribute(value="SportItemFormObj")  Item item,BindingResult result){
		if(result.hasErrors())
			return "SportItemForm";
	      itemService.addItem(item);
	MultipartFile image=item.getItemImage();
		if(image!=null && !image.isEmpty()){
		Path path=Paths.get("C:/Users/Ankur/workspace/SportShop/src/main/webapp/WEB-INF/resources/images/" 
		+ item.getIsbn() + ".jpg");
		try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
	 		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return "redirect:/getAllItems";
	}

	@RequestMapping("/editItem/{isbn}")
	public ModelAndView getEditForm(@PathVariable(value="isbn")  int isbn){
		//First read the record which has to be updated
		//select * from bookapp where isbn=?
		//Populate the form with already existing value
		Item item=this.itemService.getItemByIsbn(isbn);
		return new ModelAndView("editItemForm","editItemObj",item);
	}
	@RequestMapping(value="/editItem",method=RequestMethod.POST)
	public String editItem(@ModelAttribute(value="editItemObj") Item item)
	{
	itemService.editItem(item);
	return "redirect:/getAllItems";

	}

	@RequestMapping("/displayAllProducts")
	public ModelAndView displayAllProducts(){
		List<Item> items = itemService.displayAllProducts();
		return new ModelAndView("displayFile","items",items);
	}
}

