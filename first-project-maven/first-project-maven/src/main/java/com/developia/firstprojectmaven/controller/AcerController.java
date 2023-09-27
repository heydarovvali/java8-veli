package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.AcerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acer")
@RequiredArgsConstructor
public class AcerController {
    private final AcerService acerService;

    @GetMapping("/model")
    public String model() {
        return acerService.model();
    }

    @GetMapping("/color")
    public String color() {
        return acerService.color();
    }

    @GetMapping("/price")
    public int price() {
        return acerService.price();
    }
}
