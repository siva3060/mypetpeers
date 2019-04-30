package com.mypetpeers.mypetpeers.validation;

import org.springframework.beans.factory.annotation.Autowired;

public class UserValidation{
	

	@Autowired
	UserRepository userRepository;


	public Boolean  doesUserExist(String userName){

		//If user exist in the database
		//@@@ if user exist work on the != null method is there any better way 
		if(userRepository.findByUserName(userName) != null){
			return true;	
		}

		//If user do not exist in the database 
		  	return false;
	}
}
