package com.example.IMS.repository;

// UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.IMS.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
