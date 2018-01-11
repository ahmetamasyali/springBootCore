package com.base.service;

public interface AuthenticationService {

	public boolean login(String username, String password);

	public String loggedInUsername();

}
