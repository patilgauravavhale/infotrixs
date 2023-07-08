package com.Emp.springboot.service;

import com.Emp.springboot.model.User;
import com.Emp.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
