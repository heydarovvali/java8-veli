package com.vali.secondproject.repasitory;

import com.vali.secondproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepasitory extends JpaRepository<Student, String> {
    public Integer id(Integer id);

    public String findByName(String findByName);

}
