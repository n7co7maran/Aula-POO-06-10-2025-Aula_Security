package Aula.Spring.Security.repository;

import Aula.Spring.Security.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserDetails findByLogin(String login);
}
