package az.developia.studentcrudmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Student extends JpaRepository<Student,Integer> {
    List<Student> findAllByTeacher(String teacher);
}
