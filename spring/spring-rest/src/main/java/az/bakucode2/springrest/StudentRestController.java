package az.bakucode2.springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/students")
public class StudentRestController {

    @GetMapping(path = "/student")
    public Student findById() {
        Student s = new Student(12, "Eli");
        return s;
    }
}
