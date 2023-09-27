package com.developia.firstprojectmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Salam {

    @GetMapping("/salam")
    String salam(){
        return "salam";
    }

    @GetMapping("/sagol")
    String sagol(){
        return "sagol";
    }
}
