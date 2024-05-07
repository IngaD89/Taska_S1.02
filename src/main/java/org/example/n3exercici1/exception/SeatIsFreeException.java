package org.example.n3exercici1.exception;

public class SeatIsFreeException extends Exception{
    public SeatIsFreeException() {
        super("Seat is not reserved");
    }
}
