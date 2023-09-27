package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.AcerService;
import com.developia.firstprojectmaven.service.AsusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asus")
@RequiredArgsConstructor
public class AsusController {
    private final AsusService asusService;

    @GetMapping("/model")
    public String model() {
        return asusService.model();
    }

    @GetMapping("/color")
    public String color() {
        return asusService.color();
    }

    @GetMapping("/price")
    public int price() {
        return asusService.price();
    }
}
