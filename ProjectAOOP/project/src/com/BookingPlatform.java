package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class BookingPlatform implements Subject {

    private final Map<Observer, Set<EventType>> observers = new HashMap<>();

    @Override
    public void registerObserver(Observer observer, Set<EventType> eventTypes) {
        observers.put(observer, eventTypes);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(EventType eventType, String message) {
        for (Map.Entry<Observer, Set<EventType>> entry : observers.entrySet()) {
            if (entry.getValue().contains(eventType)) {
                entry.getKey().update(eventType, message);
            }
        }
    }

    void bookFlight(String details) {
        notifyObservers(EventType.FLIGHT_BOOKING, "Flight booked: " + details);
        confirmFlightPayment(details);
    }

    void bookHotel(String details) {
        notifyObservers(EventType.HOTEL_BOOKING, "Hotel booked: " + details);
        confirmHotelPayment(details);
    }

    void rentCar(String details) {
        notifyObservers(EventType.CAR_RENTAL, "Car rented: " + details);
        confirmCarRentalPayment(details);
    }

    private void confirmFlightPayment(String details) {
        notifyObservers(EventType.FLIGHT_PAYMENT_CONFIRMATION, "Payment confirmed for flight: " + details);
    }

    private void confirmHotelPayment(String details) {
        notifyObservers(EventType.HOTEL_PAYMENT_CONFIRMATION, "Payment confirmed for hotel: " + details);
    }

    private void confirmCarRentalPayment(String details) {
        notifyObservers(EventType.CAR_RENTAL_PAYMENT_CONFIRMATION, "Payment confirmed for car rental: " + details);
    }
}
