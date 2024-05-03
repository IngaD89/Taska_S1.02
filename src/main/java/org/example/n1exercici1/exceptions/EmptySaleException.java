package org.example.n1exercici1.exceptions;

public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("Per fer una venda primer has d’afegir productes");
    }

    public EmptySaleException(String message) {
        super(message);
    }
}
