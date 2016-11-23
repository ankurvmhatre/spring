package com.spring.services;

import com.spring.model.UserCredential;
import com.spring.model.UserDetail;

public interface UserService {


	 void insert(UserDetail userDetail);
	 void insertcredent(UserCredential userCredential);
	UserDetail getUserDetailByCustName(String username);

}
