package com.developia.firstprojectmaven.service;

import org.springframework.stereotype.Service;

@Service
public class RRService {
    public String phantom() {
        return "phantom";
    }

    public String color() {
        return "black";
    }

    public int price() {
        return 5000;
    }
}
