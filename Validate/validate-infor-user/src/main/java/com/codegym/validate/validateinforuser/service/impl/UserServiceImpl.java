package com.codegym.validate.validateinforuser.service.impl;

import com.codegym.validate.validateinforuser.model.SignUp;
import com.codegym.validate.validateinforuser.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(SignUp signUp) {
        // Logic to save user to database
    }
}
