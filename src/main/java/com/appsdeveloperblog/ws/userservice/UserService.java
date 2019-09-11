package com.appsdeveloperblog.ws.userservice;

import com.appsdeveloperblog.ws.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.ws.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
}
