package com.example.IMS.service;

import com.example.IMS.model.User;
import com.example.IMS.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User authenticateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
    // Other method implementations

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
    // Other methods for user-related operations


