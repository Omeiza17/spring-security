package dev.codingstoic.jpasecurity.repository;

import dev.codingstoic.jpasecurity.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
}
