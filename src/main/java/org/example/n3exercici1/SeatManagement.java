package org.example.n3exercici1;

import org.example.n3exercici1.exception.SeatIsAlreadyInUseException;
import org.example.n3exercici1.exception.SeatIsFreeException;

import java.util.ArrayList;

public class SeatManagement {
    private ArrayList<Seat> seats;

    public SeatManagement() {
        this.seats = new ArrayList<>();
    }

    public ArrayList<Seat> getSeats() {
        return this.seats;
    }

    public void addSeat(Seat seat) throws SeatIsAlreadyInUseException {
        for (Seat s : seats) {
            if (s.equals(seat.getRow(), seat.getSeatNumber())) {
                throw new SeatIsAlreadyInUseException();
            } else {
                seats.add(seat);
            }
        }
    }

    public void deleteSeat(int row, int seatNumber) throws SeatIsFreeException {
        int seatId = findSeat(row, seatNumber);
        if(seatId == -1){
            throw new SeatIsFreeException();
        } else {
            seats.remove(seatId);
        }

    }

    public int findSeat(int anotherRow, int anotherSeatNumber){
        int seatId = -1;
        boolean found = false;
        int i = 0;

        while (i < seats.size() && !found){
            if((seats.get(i).getRow() == anotherRow)
                    && (seats.get(i).getSeatNumber() == anotherSeatNumber)){
                seatId = i;
                found = true;
            }
            i++;
        }

        return seatId;
    }
}
