package com.example.splitwise.DB;

import java.util.ArrayList;

import com.example.splitwise.models.UserProfile;

import org.springframework.util.SystemPropertyUtils;

public class SplitData {
    private static ArrayList<UserProfile> userProfiles = null;

    private SplitData(){

    }
    public static ArrayList<UserProfile> getData(){
        System.out.println("Anmol==========================");
        if(userProfiles == null){
            userProfiles = new ArrayList<>();
        }
        return userProfiles;
    }
}
