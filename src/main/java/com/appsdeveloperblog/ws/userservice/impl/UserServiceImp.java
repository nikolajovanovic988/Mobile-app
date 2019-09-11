package com.appsdeveloperblog.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.ws.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.ws.model.response.UserRest;
import com.appsdeveloperblog.ws.shared.Utils;
import com.appsdeveloperblog.ws.userservice.UserService;

@Service
public class UserServiceImp implements UserService{

	Map<String, UserRest> users;
	Utils utils;
	
	public UserServiceImp() {
		
	}
	@Autowired
	public UserServiceImp(Utils utils) {
		this.utils = utils;
	}

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());
		
		String userId = utils.gemerateUserId();
		returnValue.setUserId(userId);
		
		if (users == null) users = new HashMap<String, UserRest>();
		users.put(userId, returnValue);
		
		return returnValue;
	}

}
