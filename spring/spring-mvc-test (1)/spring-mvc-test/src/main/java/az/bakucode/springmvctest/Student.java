//package az.bakucode.springmvctest;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDate;
//@Entity
//@Table(name = "students")
//public class Student {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String name;
//    private LocalDate birthday;
//    private String sector;
//
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//
//    public Student(Integer id,String name){
//        super();
//        this.id = id;
//        this.name = name;
//    }
//
//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getSector() {
//        return sector;
//    }
//
//    public void setSector(String sector) {
//        this.sector = sector;
//    }
//}
package az.bakucode.springmvctest;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 4

    private String name; // 40
    private Date birthday; // 20
    private String sector; // 20

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }



    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    public Student() {
        // TODO Auto-generated constructor stub
    }
}
