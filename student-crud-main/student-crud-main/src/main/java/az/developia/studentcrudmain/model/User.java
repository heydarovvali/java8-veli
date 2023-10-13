package az.developia.studentcrudmain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User {
    @Id

    private String username;
    private String password;
    private Boolean enabled;
}
