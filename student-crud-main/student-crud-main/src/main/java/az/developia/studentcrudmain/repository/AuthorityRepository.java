package az.developia.studentcrudmain.repository;

import az.developia.studentcrudmain.model.AuthorityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<AuthorityModel,Integer> {

}
