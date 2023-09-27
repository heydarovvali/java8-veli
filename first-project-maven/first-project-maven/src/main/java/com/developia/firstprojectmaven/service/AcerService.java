package com.developia.firstprojectmaven.service;

import org.springframework.stereotype.Service;

@Service
public class AcerService {
    public String model() {
        return "Predator";
    }

    public String color() {
        return "Black";
    }

    public int price() {
        return 2500;
    }
}
