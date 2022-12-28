package com.example.atm.User;

public class UserDtoMapper {
    static UserDto map(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getPin(),
                user.getBalance()
        );
    }
}
