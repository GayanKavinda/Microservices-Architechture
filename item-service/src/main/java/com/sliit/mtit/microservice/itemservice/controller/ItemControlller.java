package com.sliit.mtit.microservice.itemservice.controller;

import com.sliit.mtit.microservice.itemservice.dto.UserRequest;
import com.sliit.mtit.microservice.itemservice.dto.UserResponse;

import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping("/items")
public class ItemControlller {
    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody
    UserResponse createUser(@RequestBody UserRequest userRequest) {


        System.out.println("Item Details : " + userRequest);

        var userResponse = new UserResponse();
        userResponse.setItemId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully Created the Item");

        return userResponse;
    }
}
