package com.labas.travelagency.exceptions;

public class ReservationException extends TravelAgencyException {
    public ReservationException(String message) {
        super(message);
    }

    public ReservationException(String message, Throwable cause) {
        super(message, cause);
    }
}
