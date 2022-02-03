package com.example.splitwise.models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.NonFinal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class UserProfile {
    
    @NonNull
    private String userName;

    public UserProfile(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }


    public UserProfile() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
