package com.example.atm.User;

import com.example.atm.User.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findBySurnameIgnoreCaseAndNameIgnoreCase(String name, String surname);
}
