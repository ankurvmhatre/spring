/**
 * 
 */
var myapp=angular.module("myapp",[])
.controller("itemController",function($scope,$http){
	
	
	$scope.getBooks=function(){
		$http.get('http://localhost:8080/SportEquipment/getBooksList').success(function(data){
			$scope.items=data;
		})
	}
	$scope.addToCart=function(isbn){
    	$http.put('http://localhost:8080/SportEquipment/add/'+ isbn).success(function(){
    		alert('Item successfully added to the cart!')
    	})
    }
    

    $scope.refreshCart=function(){
    	$http.get('http://localhost:8080/SportEquipment/getCart/'+$scope.cartId).success(function(data){
    		$scope.cart=data;
    	})
    } 
    $scope.getCart=function(cartId){
    	$scope.cartId=cartId;
    	$scope.refreshCart(cartId);
    }

    
    $scope.calculateGrandTotal=function(){
    	var grandTotal=0.0
    	for(var i=0;i<$scope.cart.cartItems.length;i++)
    		grandTotal=grandTotal+$scope.cart.cartItems[i].totalPrice;
    	return grandTotal;
    }

});
