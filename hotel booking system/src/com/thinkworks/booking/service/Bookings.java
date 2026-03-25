package com.thinkworks.booking.service;
import com.thinkworks.booking.dto.Guest;
import com.thinkworks.booking.dto.Room;

public class Bookings {


    public void printRoomDetails(Room room){

        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room type: " + room.getRoomType());
        System.out.println("Price for the selected room type for one night stay: " + room.getRoomType());
        System.out.println("Room availability: " + room.isAvailable());
    }

    public void printGuestDetails(Guest guest){

        System.out.println("Booking ID: " + guest.getBookingId());
        System.out.println("Name of the guest: " + guest.getGuestName());
        System.out.println("Phone number: " + guest.getGuestPhoneNumber());
        System.out.println("Email: " + guest.getGuestEmail());
        System.out.println("No.of Rooms booked: " + guest.getNumberOfRooms());
   }

    public void displayAvailableRoomList(Room[] rooms){

        if (rooms != null){
            for (Room room: rooms){
                if (room.isAvailable()){
                    room.setAvailable(false);
                    System.out.println("room is already booked");
                }
            }
        }
    }

    public double calculateTotalPrice(Guest guest){

        Room[] rooms = guest.getRooms();
        double totalPrice = 0;
        for (Room room: rooms){

            //totalPrice = totalPrice + (room.getRoomType()*room.getNumberOfNightStays());
        }
        return totalPrice;
    }

    public void booking(Guest guest){

        if (guest != null){
                //if (.isAvailable()){
                   // System.out.println(room.getRoomTypeAndPrice());

            }

    }
}
