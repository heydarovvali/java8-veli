package az.developia.studentcrudmain.repository;

import az.developia.studentcrudmain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
