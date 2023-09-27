package com.developia.firstprojectmaven.service;

import org.springframework.stereotype.Service;

@Service
public class SamsungService {
    public String model() {
        return "S21 ultra";
    }

    public String color() {
        return "gray";
    }

    public int memory() {
        return 256;
    }
}
