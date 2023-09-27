package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.IphoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iphone")
@RequiredArgsConstructor
public class IphoneController {

    private final IphoneService iphoneService;
    @GetMapping("/model")
    public String iphone(){
        return iphoneService.model();
    }
    @GetMapping("/color")
    public String color(){
        return iphoneService.color();
    }
    @GetMapping("/price")
    public int price(){
        return iphoneService.price();
    }
}
