package org.example.n3exercici1.exception;

public class SeatIsAlreadyInUseException extends Exception{

    public SeatIsAlreadyInUseException() {
        super("Seat is already in use");
    }

}
