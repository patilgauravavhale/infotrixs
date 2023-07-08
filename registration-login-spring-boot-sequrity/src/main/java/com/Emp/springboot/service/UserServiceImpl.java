package com.Emp.springboot.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.Emp.springboot.model.Role;
import com.Emp.springboot.model.User;
import com.Emp.springboot.repository.UserRepository;
import com.Emp.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userrepository;

   public UserServiceImpl(UserRepository userrepository) {
		super();
		this.userrepository = userrepository;
	}




	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstname(),registrationDto.getLastname(),
	 registrationDto.getEmail(),registrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		
		return userrepository.save(user);
	}

}
