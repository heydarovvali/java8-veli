package az.developia.studentcrudmain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class StudentNote {
    @Id
    @GeneratedValue
    private Integer id;
    private String note;
    private Integer studentId;

}
