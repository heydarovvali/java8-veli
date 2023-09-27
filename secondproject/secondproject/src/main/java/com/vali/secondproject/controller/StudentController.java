package com.vali.secondproject.controller;

import com.vali.secondproject.service.StrudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vali")
@RequiredArgsConstructor
public class StudentController {
    private final StrudentService strudentService;
    @GetMapping("/ad")
    public String name(){
        return strudentService.name();
    }
    @GetMapping("/yas")
    public int age(){
        return strudentService.age();
    }
}
