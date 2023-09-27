package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.LexusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lexus")
@RequiredArgsConstructor
public class LexusController {
    private final LexusService lexusService;
@GetMapping
    String lexus() {
        return lexusService.is350() + " : " + lexusService.color();
    }
}
