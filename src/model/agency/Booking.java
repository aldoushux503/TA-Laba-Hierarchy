package model.agency;

import core.Entity;
import core.Tour;
import manager.BookingPriceManager;

import java.time.LocalDate;

/**
 * Represents a booking made by customer
 * <p>
 * One-to-Many relationship with Customer and Tour;
 */
public class Booking extends Entity {
    private Customer customer;
    private Tour tour;
    private LocalDate date;
    private double price;

    public Booking(long id, Customer customer, Tour tour, LocalDate date) {
        super(id);
        this.customer = customer;
        this.tour = tour;
        this.date = date;
        this.price = BookingPriceManager.calculateTourPrice(tour);
    }

    @Override
    public String toString() {
        return String.format("Client %s has a booking to %s", customer.getFullName(), tour.getName());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}