package az.developia.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
 @Scope(scopeName = "prototype")
public class Student {
    String name;
    String surname;

    public Student() {
        name = "Vali";
        surname = "Heydarov";
        System.out.println("Student - object created");
    }
}
