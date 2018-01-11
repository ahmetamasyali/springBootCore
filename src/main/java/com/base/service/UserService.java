package com.base.service;

import com.base.model.User;

public interface UserService{

	public User findByUsername(String username);

	public User save(User user);
}
