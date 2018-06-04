package com.multiple.demo.provider.controller;

import com.multiple.demo.provider.entity.User;
import com.multiple.demo.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/provid/{id}")
    private User findById(@PathVariable Long id){
        return this.userRepository.getOne(id);
    }

}
