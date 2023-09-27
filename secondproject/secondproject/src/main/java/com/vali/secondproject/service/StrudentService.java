package com.vali.secondproject.service;

import com.vali.secondproject.repasitory.StudentRepasitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class StrudentService {
    private final StudentRepasitory studentRepasitory;


    public String findByName(String name) {
        return studentRepasitory.findByName(name);
    }

    public int age() {
        return 27;
    }

    public Integer id(int kod) {
        return studentRepasitory.id(kod);
    }
}
