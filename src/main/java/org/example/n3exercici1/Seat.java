package org.example.n3exercici1;

public class Seat {
    private int row;
    private int seatNumber;
    private Person person;

    public Seat(int row, int seatNumber, Person person) {
        this.row = row;
        this.seatNumber = seatNumber;
        this.person = person;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Boolean equals(int anotherRow, int anotherSeatNumber){
        boolean isEqual = false;
        if((this.row == anotherRow) && (this.seatNumber == anotherSeatNumber)){
            isEqual = true;
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "Fila = " + this.row +
                ", Seient = " + this.seatNumber +
                ", Persona = " + this.person.getName() + " " + this.person.getLastName() +
                '}';
    }
}
