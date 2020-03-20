package com.greenfox.reddit.services;


import com.greenfox.reddit.models.entities.User;
import com.greenfox.reddit.models.entities.UserRatedPost;
import com.greenfox.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }



    public Long getIDByName(String name) {
        return userRepository.findAllByName(name).get(0).getId();
    }


}
