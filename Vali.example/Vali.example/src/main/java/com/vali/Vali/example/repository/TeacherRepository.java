package com.vali.Vali.example.repository;

import com.vali.Vali.example.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
