package com.greenfox.reddit.services;


import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUserIfNew(String userName) {
        if (getIdIfExits(userName) == null) {
            userRepository.save(new User(userName));
        }
    }

    public Long getIdIfExits(String name) {
        List<User> users = userRepository.findAllByUserName(name);
        if (users.isEmpty()) {
            return null;
        } else return users.get(0).getId();
    }


    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
