package com.example.atm.User;

public class UserDto {
    private long id;
    private String name;
    private String surname;
    private int pin;
    private Double balance;

    public UserDto(long id, String name, String surname, int pin, Double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pin = pin;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
