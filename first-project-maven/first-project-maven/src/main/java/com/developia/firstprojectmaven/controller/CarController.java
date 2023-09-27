package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.BmwService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CarController {
    private final BmwService service;
    @GetMapping
    String car(){
        return service.m5();
    }
}

