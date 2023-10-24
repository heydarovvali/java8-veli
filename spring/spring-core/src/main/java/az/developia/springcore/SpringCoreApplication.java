package az.developia.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//config
//component scan
//auto config

public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext c = SpringApplication.run(SpringCoreApplication.class, args);
//        Student s = c.getBean(Student.class);
//        s.name = "Ali";
//        System.out.println(s.name);
//        Student s2 = c.getBean(Student.class);
//        System.out.println(s2.name);
        Person f = c.getBean(Person.class);
        System.out.println(f.getId());
        System.out.println(f.getName());
        System.out.println(f.getAge());
        System.out.println(f.getSalary());


    }

}
