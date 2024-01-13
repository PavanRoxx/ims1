package com.example.IMS.service;

import com.example.IMS.model.User;

public interface UserService {
    User authenticateUser(String email, String password);
    void saveUser(User user);
    void registerUser(User user);
}
