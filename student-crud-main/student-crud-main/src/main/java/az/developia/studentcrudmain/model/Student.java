package az.developia.studentcrudmain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @NotEmpty(message = "bos qoymaq olmaz")
    @Size(min = 3, message = "Ad minimum 3 herfli olmalidir")
    @Size(max = 30, message = "Ad maximum 30 herfli olmalidir")
    private String name;

    @NotEmpty(message = "bos qoymaq olmaz")
    @Size(min = 3, message = "Soyad minimum 3 herfli olmalidir")
    @Size(max = 30, message = "Soyad maximum 30 herfli olmalidir")
    private String surName;

    private String teacher;
    private String profilePhoto;

}
