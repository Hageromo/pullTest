package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public Iterable<User> getUser(){

        User user =new User();
        user.setEmail("MiloDupcia@chybTy");
        user.setName("Sriłosz");
        userRepository.save(user);

        User user1 =new User();
        user1.setEmail("cisnijSpringa@Kubsztal");
        user1.setName("Kubsztal");
        userRepository.save(user1);

        return userRepository.findAll();
    }

}
