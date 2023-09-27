package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.BentleyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/luxcar")
@RequiredArgsConstructor
public class BentleyController {
    private final BentleyService bentleyService;
@GetMapping("/ddd")
    public String bentayga() {
        return bentleyService.bentayga();
    }
    @GetMapping("/eee")

    public String color() {
        return bentleyService.color();
    }
@GetMapping("/qqq")
    public int price() {
        return bentleyService.price();
    }
}
