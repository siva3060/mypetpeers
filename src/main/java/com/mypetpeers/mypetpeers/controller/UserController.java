package com.mypetpeers.mypetpeers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypetpeers.mypetpeers.dto.RegistrationRequest;
import com.mypetpeers.mypetpeers.service.UserService;
import com.mypetpeers.mypetpeers.validation.UserValidation;

@RequestMapping("/UserApi")
@RestController
public class UserController{


	@Autowired
	UserService userService;

	@Autowired
	UserValidation userValidation;


	//user registration
	@PostMapping("/registerUser")
	public @ResponseEntity ResponseEntity<String> userRegistration(@RequestBody RegistrationRequest registrationRequest){

		//If user exist
		if(userValidation.doesUserExist(registrationRequest.getUserName())){
			return new ResponseEntity("User Already Exist",HttpStatus.USEREXIST);
		}
		//If user do not exist
		userService.createUser(registrationRequest);
		return new ResponseEntity("User Profile Created Sucessfully",HttpStatus.CREATED);
       	}
}


//@@ what is the best design practise to handle exception 
//@@ what is the best way to use response entity 
//@@ best way to handle during user registration
//@@ what are some of the popular design patters using in designing spring MVC
