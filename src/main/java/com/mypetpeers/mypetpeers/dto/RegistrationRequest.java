package com.mypetpeers.mypetpeers.dto;

import  java.io.Serializable;

import lombok.Data;


@Data
public class RegistrationRequest implements Serializable{
	
	private String userName;
	private String userPassword;
}
