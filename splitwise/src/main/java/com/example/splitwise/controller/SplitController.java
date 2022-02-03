package com.example.splitwise.controller;

import javax.validation.Valid;

import com.example.splitwise.models.UserProfile;
import com.example.splitwise.services.SplitServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SplitController {

    @Autowired
    private SplitServices splitServices;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserProfile userProfile){

        System.out.println("Reached " + userProfile.getUserName());
        if(userProfile.getUserName() == null){
            return new ResponseEntity<String>("User Already present", HttpStatus.BAD_REQUEST);
        }
        boolean isUserRegistered = splitServices.registerUser(userProfile);
        if(userProfile != null && isUserRegistered == true)
            return new ResponseEntity<String>("User Registered", HttpStatus.OK);
        else    
            return new ResponseEntity<String>("User Already present", HttpStatus.BAD_REQUEST);
    }

    // @PostMapping("/transaction")
    // public ResponseEntity<String> doTransaction(@RequestBody TransactionRequest transactionRequest){
    //     boolean transactionSuccess = 
    // }
}
