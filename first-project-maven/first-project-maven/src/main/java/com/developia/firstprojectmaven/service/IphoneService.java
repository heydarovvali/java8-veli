package com.developia.firstprojectmaven.service;

import org.springframework.stereotype.Service;

@Service
public class IphoneService {
    public String model(){
        return "14 pro";
    }
    public String color(){
        return "gold";
    }
    public int price(){
        return 899;
    }
}
