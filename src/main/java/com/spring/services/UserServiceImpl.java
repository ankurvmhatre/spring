package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.model.UserCredential;
import com.spring.model.UserDetail;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
	private UserDao userDao;
    
	  public UserDao getuserDao() {
			
		  return userDao;
		}

		
		public void insert(UserDetail userDetail){
			
			userDao.insert(userDetail);
			
		}
		
		public void insertcredent(UserCredential userCredential) {
			
		}


		public UserDetail getUserDetailByCustName(String username) {
			// TODO Auto-generated method stub
			return userDao.getUserDetailByCustName(username);
		}


		
  }

