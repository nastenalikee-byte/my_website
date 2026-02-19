package com.shop.cosmetics.service;

import com.shop.cosmetics.entity.User;
import com.shop.cosmetics.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }


}




