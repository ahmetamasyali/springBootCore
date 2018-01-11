package com.base.repository;


import org.springframework.data.repository.CrudRepository;

import com.base.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

	public User save(User user);

	
}
