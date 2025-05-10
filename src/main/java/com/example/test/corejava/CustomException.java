package com.example.test.corejava;

public class CustomException {

    public static void main(String[] args) throws InvalidAgeException {
        int age = 15;
        if (age < 18) throw new InvalidAgeException("Not eligible to vote");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

