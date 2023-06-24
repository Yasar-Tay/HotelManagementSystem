package com.tpe.HotelManagementSystem.exception;

public class RoomResourceNotFoundException extends RuntimeException{
    public RoomResourceNotFoundException(String message){
        super(message);
    }
}
