package com.developia.firstprojectmaven.service;

import org.springframework.stereotype.Service;

@Service
public class AsusService {
    public String model() {
        return "Tuf";
    }

    public String color() {
        return "Black";
    }

    public int price() {
        return 2000;
    }
}
