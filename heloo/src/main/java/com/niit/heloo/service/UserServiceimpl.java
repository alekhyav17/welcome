package com.niit.heloo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.heloo.dao.UserDAO;
import com.niit.heloo.model.SignupModel;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserDAO userDAO;

	public void insertSignupModel(SignupModel u) {
		userDAO.insertSignupModel(u);
	}

}
