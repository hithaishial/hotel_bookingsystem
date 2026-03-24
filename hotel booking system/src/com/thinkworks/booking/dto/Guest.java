package com.thinkworks.booking.dto;

import com.thinkworks.booking.service.Bookings;

public class Guest {

    private String guestName;
    private String bookingId;
    private String guestPhoneNumber;
    private String guestEmail;
    private int numberOfRooms;
    private Room[] rooms;

    public Guest(String guestName, String guestPhoneNumber, String guestEmail, String bookingId, int numberOfRooms) {
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.guestEmail = guestEmail;
        this.bookingId = bookingId;
        this.numberOfRooms = numberOfRooms;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
