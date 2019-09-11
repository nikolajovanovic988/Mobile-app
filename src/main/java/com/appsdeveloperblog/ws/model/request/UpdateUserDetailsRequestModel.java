package com.appsdeveloperblog.ws.model.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UpdateUserDetailsRequestModel {

	@NotNull(message = "First name cannot be null")
	@Size(min = 2, message = "Name must be longer or equal than 2 characters")
	private String firstName;

	@NotNull(message = "lastName name cannot be null")
	@Size(min = 2, message = "lastName must be longer or equal than 2 characters")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
