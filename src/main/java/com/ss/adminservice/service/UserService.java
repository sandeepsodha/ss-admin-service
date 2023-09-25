package com.ss.adminservice.service;

import com.ss.adminservice.entity.User;
import com.ss.adminservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User User) {
        return userRepository.save(User);
    }

    public User updateUser(Long id, User updated) {
        User existing = userRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setUsername(updated.getUsername());
            existing.setPassword(updated.getPassword());
            existing.setEmail(updated.getEmail());
            existing.setFirstName(updated.getFirstName());
            existing.setLastName(updated.getLastName());
            existing.setPhoneNumber(updated.getPhoneNumber());
            existing.setUserType(updated.getUserType());
            return userRepository.save(existing);
        }

        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

