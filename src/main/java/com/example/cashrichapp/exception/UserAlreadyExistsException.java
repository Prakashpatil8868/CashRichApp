package com.example.cashrichapp.exception;

public class UserAlreadyExistsException extends Exception{
    public  UserAlreadyExistsException(String message){
        super(message);
    }
}
