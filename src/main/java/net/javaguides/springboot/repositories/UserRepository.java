package net.javaguides.springboot.repositories;

import net.javaguides.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
