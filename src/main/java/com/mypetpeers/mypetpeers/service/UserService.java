package com.mypetpeers.mypetpeers.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mypetpeers.mypetpeers.dto.RegistrationRequest;
import com.mypetpeers.mypetpeers.repository.UserRepository;

public class UserService{

	@Autowired
	UserRepository userRepository;



	public void createUser(RegistrationRequest registrationRequest){

		//create new user and save to repository
		User currentUser = new user();
		currentUser.setUserName(registrationRequest.getUserName());
		currentUser.setUserPassword(registratinRequest.getUserpassword());
		userRepository.save(currentUser);
		
	}
}
