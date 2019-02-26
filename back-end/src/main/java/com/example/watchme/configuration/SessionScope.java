package com.example.watchme.configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Scope(value ="singleton")
@Component

public class SessionScope {
	Long token;

	public SessionScope() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getToken() {
		return token;
	}

	public void setToken(Long token) {
		this.token = token;
	}
	
	
	

}
