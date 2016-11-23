package com.spring.dao;

import com.spring.model.UserCredential;
import com.spring.model.UserDetail;

public interface UserDao {

	
	 void insert(UserDetail userDetail);
	 void insertcredent(UserCredential userCredential);
	UserDetail getUserDetailByCustName(String username);
}
