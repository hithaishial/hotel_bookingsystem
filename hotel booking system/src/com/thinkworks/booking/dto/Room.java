package com.thinkworks.booking.dto;

public class Room {

    private int roomNumber;
    private RoomType roomType;
    private boolean isAvailable;
    private int numberOfNightStays;

    public Room(int roomNumber, RoomType roomType, int numberOfNightStays, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
        this.numberOfNightStays = numberOfNightStays;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomTypeAndPrice(RoomType roomTypeAndPrice) {
        this.roomType = roomType;
    }

    public int getNumberOfNightStays() {
        return numberOfNightStays;
    }

    public void setNumberOfNightStays(int numberOfNightStays) {
        this.numberOfNightStays = numberOfNightStays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
