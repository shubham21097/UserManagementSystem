package com.microservice.usermanagement.service;

import com.microservice.usermanagement.dao.ResponseDao;
import com.microservice.usermanagement.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public ResponseDao authenticateUser(String email, String password);

    ResponseDao saveUser(User user);
}
