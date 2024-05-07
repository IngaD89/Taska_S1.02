package org.example.n3exercici1;

import org.example.n3exercici1.exception.SeatIsAlreadyInUseException;
import org.example.n3exercici1.exception.SeatIsFreeException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Movie {
    Scanner scanner = new Scanner(System.in);
    private int rowNumber;
    private int seatNumberPerRow;
    private SeatManagement seatManagement;

    public Movie() {
        this.seatManagement = new SeatManagement();
        requestInitialData();
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getSeatNumberPerRow() {
        return this.seatNumberPerRow;
    }

    public void setSeatNumberPerRow(int seatNumberPerRow) {
        this.seatNumberPerRow = seatNumberPerRow;
    }

    public SeatManagement getSeatManagement() {
        return this.seatManagement;
    }

    public void setSeatManagement(SeatManagement seatManagement) {
        this.seatManagement = seatManagement;
    }

    public void requestInitialData() {
        this.rowNumber = 20;
        this.seatNumberPerRow = 15;

    }

    public void start() {
        // TODO aquí va toda la logica del Movie servirá para iniciar el programa
    }

    public int menu() {
        int option = 0;
        System.out.println(
                """
                Escoge una opción: \s
                1. Mostrar totes les butaques reservades.\s                 
                2. Mostrar les butaques reservades per una persona. \s                                                
                3. Reservar una butaca.\s                                               
                4. Anul·lar la reserva d’una butaca.\s                                                
                5. Anul·lar totes les reserves d’una persona.\s                                               
                0.- Sortir.\s
                """
        );

        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public ArrayList<Seat> showAllReservedSeat(){
        ArrayList<Seat> reservedSeats;
        reservedSeats = seatManagement.getSeats();
        return reservedSeats;
    }

    public ArrayList<Seat> showSeatsPerPerson(){

        return null;
    }

    public void reserveSeat() throws SeatIsAlreadyInUseException {
        int row = introduceRow();
        int seatNumber = introduceSeatNumber();
        Person person = introducePerson();
        Seat seat = new Seat(row, seatNumber, person);

        try {
            seatManagement.addSeat(seat);
        } catch (SeatIsAlreadyInUseException e) {
            throw new SeatIsAlreadyInUseException();
        }
    }

    public void cancelReserve() throws SeatIsFreeException {
        int row = introduceRow();
        int seatNumber = introduceSeatNumber();

        try {
            seatManagement.deleteSeat(row, seatNumber);
        } catch (SeatIsFreeException e) {
            throw new SeatIsFreeException();
        }
    }

    public int introduceRow(){
        boolean isValid = false;
        int row = 0;

        while (!isValid) {
            try {
                System.out.println("Introduce la fila");
                row = scanner.nextInt();
                scanner.nextLine();
                isValid = true;
                //seat.setRow(row);
                System.out.println("Se ha guardado la fila satisfactoriamente");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.nextLine();
            }
        }

        return row;
    }

    public int introduceSeatNumber(){
        boolean isValid = false;
        int seatNumber = 0;

        while (!isValid) {
            try {
                System.out.println("Introduce numero del asiento");
                seatNumber = scanner.nextInt();
                scanner.nextLine();
                isValid = true;
                //seat.setSeatNumber(seatNumber);
                System.out.println("Se ha guardado el numero del asiento satisfactoriamente");
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                scanner.nextLine();
            }
        }

        return seatNumber;
    }

    public Person introducePerson(){
        Person person = null;
        boolean isValid = false;
        String firstName = " ";
        String lastName = " ";

        while (!isValid){
            try {
                System.out.println("Introduce nombre del usuario");
                firstName = scanner.nextLine();
                System.out.println("Introduce apellido del usuario");
                lastName = scanner.nextLine();
                isValid = true;
               // person.setName(firstName);
               // person.setLastName(lastName);
                person = new Person(firstName, lastName);
                System.out.println("Nombre y apellido guardado satisfactoiamnte");
            } catch (InputMismatchException e){
                System.out.println("Debe introducir una cadena de texto");
            }
        }
        return person;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rowNumber=" + this.rowNumber +
                ", seatNumberPerRow=" + this.seatNumberPerRow +
                ", seatManagement=" + this.seatManagement +
                '}';
    }
}
