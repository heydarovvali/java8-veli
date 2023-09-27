package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.SamsungService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samsung")
@RequiredArgsConstructor
public class SamsungController {
    private final SamsungService samsungService;
    @GetMapping("/model")
    public String model(){
        return samsungService.model();
    }
    @GetMapping("/color")
    public String color(){
        return samsungService.color();
    }
    @GetMapping("/memory")
    public int memory(){
        return samsungService.memory();
    }
}
