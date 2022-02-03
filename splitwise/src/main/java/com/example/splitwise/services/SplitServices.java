package com.example.splitwise.services;

import java.util.ArrayList;

import com.example.splitwise.DB.SplitData;
import com.example.splitwise.models.UserProfile;

import org.springframework.stereotype.Service;

@Service
public class SplitServices {
    
    private ArrayList<UserProfile> userProfiles;

    protected SplitServices(){
        System.out.println("=================Reached in services=======================");
        this.userProfiles = SplitData.getData();
    }

    private boolean isUserValid(UserProfile currUserProfile){
        String userName = currUserProfile.getUserName();
        for (UserProfile userProfile : userProfiles) {
            if(userProfile.getUserName().equals(userName)){
                return false;
            }
        }
        return true;
    }
    public boolean registerUser(UserProfile userProfile){
        System.out.println("Reached in services");
        if(isUserValid(userProfile) == true){
            userProfiles.add(userProfile);
            return true;
        }
        else    
            return false;
    }
}
