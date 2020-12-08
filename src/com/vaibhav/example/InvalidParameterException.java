package com.vaibhav.example;

public class InvalidParameterException extends Throwable {
    public InvalidParameterException(String number_should_be_positive) {
        super(number_should_be_positive);
    }
}
