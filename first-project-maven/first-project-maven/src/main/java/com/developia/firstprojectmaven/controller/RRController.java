package com.developia.firstprojectmaven.controller;

import com.developia.firstprojectmaven.service.RRService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/YY")
@RequiredArgsConstructor

public class RRController {

    private final RRService rrService;
    @GetMapping("/BB")
    public String phantom(){
        return rrService.phantom();

    }

}
