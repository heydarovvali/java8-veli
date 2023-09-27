package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.StudenService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudenService service;

@GetMapping

    String veli(){
        return service.salam();
    }
}
