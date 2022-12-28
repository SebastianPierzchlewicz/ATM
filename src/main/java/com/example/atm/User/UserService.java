package com.example.atm.User;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<User> findUserBySurnameAndName(String name, String surname){
        return userRepository.findBySurnameIgnoreCaseAndNameIgnoreCase(name, surname);
    }
    public void addBalance(UserDto user){
        User userToSave = new User();
        userToSave.setBalance(user.getBalance());
        userRepository.save(userToSave);
    }
}
