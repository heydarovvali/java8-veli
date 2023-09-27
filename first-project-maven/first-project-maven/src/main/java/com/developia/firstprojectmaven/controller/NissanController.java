package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.NissanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nissan")
@RequiredArgsConstructor
public class NissanController {
    private final NissanService nissanService;
@GetMapping
    String nissan() {
        return nissanService.gtr() + " : " + nissanService.color();

    }
}