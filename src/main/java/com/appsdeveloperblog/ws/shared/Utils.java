package com.appsdeveloperblog.ws.shared;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Utils {

	
	public String gemerateUserId() {
		return UUID.randomUUID().toString();
	}
}
