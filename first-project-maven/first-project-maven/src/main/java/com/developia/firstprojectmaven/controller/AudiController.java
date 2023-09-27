package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.AudiService;
import com.developia.firstprojectmaven.service.LexusService;
import com.developia.firstprojectmaven.service.NissanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audi")
@RequiredArgsConstructor
public class AudiController {
    private final AudiService audiService;
@GetMapping
    String audi() {
        return audiService.s8() + " : " + audiService.color();
    }
}
