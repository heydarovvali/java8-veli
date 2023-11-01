//package az.bakucode.springmvctest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Controller
//@RequestMapping(path = "/students")
//public class StudentController {
//@Autowired
//    private StudentRepo repo;
////    List<Student> students = new ArrayList<>();
////    {
////        students.add(new Student(1,"Vali"));
////        students.add(new Student(2,"Haydar"));
////    }
//
//
//    @GetMapping(path = "/search")
//    // search?q // name = "q" esas seacrh-daki "q" ile "name = "q" " / name-ki q beraber olmaildir
//    public String google(Model model, @RequestParam(name = "q",required = false,defaultValue = "") String q) {  //"q"-bu q acar sozdur
//
//
//
//
//
//
//        List<Student> studentsfiltered = repo.findAll().stream().filter(s -> {
//            return s.getName().contains(q);
//        }).collect(Collectors.toList());
//
//
//        model.addAttribute("students", studentsfiltered); //addAttribute view-e melumat gondermey ucun ortaq yaddasdir
//
//        return "students";
//    }
//
//
//
//
//    @GetMapping(path = "/open-save")
//
//    public String openSave(Model model) {
//
//
//        Student student = new Student(0, "");
//
//
//        model.addAttribute("student", student);
//        model.addAttribute("header", "qeydiyyat");
//
//        return "save-student";
//    }
//
//
//
//
//
//    @PostMapping(path = "/save")
//    public String save(@ModelAttribute(name = "student") Student s) {
//        repo.save(s);
//        // burada telebeni qeyd et
//        return "redirect:/students/search";
//    }
//}

package az.bakucode.springmvctest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepo repo;

//	List<Student> students =new  ArrayList<>();
//
//	 {
//		students.add(new Student(1, "Ilyas"));
//		students.add(new Student(2, "Veli"));
//
//	}

    @GetMapping(path = "/search") // search?q=Veli
    public String google(Model model, @RequestParam(name = "q", required = false, defaultValue = "") String query) {

        List<Student> studentsfiltered = repo.findAll().stream().filter(s -> s.getName().contains(query)

        ).collect(Collectors.toList());

        model.addAttribute("students", studentsfiltered);

        return "students";
    }

    @GetMapping(path = "/open-save")
    public String openSave(Model model) {

        Student student = new Student(0, "");

        model.addAttribute("student", student);
        model.addAttribute("header", "qeydiyyat");

        return "save-student";
    }

    @PostMapping(path = "/save")
    public String save(@ModelAttribute(name = "student") Student s) {
        //
        // burada qeyd et telebeni
        repo.save(s); // 0,null, not found insert
        return "redirect:/students/search";
    }

    @GetMapping(path = "/{id}")
    public String delete(@PathVariable Integer id) {
        repo.deleteById(id);

        return "redirect:/students/search";
    }

    @GetMapping(path = "/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {

        Student student = repo.findById(id).get();

        System.out.println(student.getBirthday());

        model.addAttribute("student", student);
        model.addAttribute("header", "redakte");

        return "save-student";
    }

}