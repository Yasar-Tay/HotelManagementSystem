package com.tpe.HotelManagementSystem.exception;

public class HotelResourceNotFoundException extends RuntimeException{
    public HotelResourceNotFoundException(String message){
        super(message);
    }
}
