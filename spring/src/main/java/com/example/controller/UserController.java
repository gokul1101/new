package com.example.controller;

import java.util.List;

import com.example.model.AdminModel;
import com.example.model.BikeModel;
import com.example.model.BookingsModel;
import com.example.model.UserModel;
import com.example.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    protected UserService userService;

    @GetMapping("/user/dashboard")
    public List<AdminModel> getCompanies() {
        return userService.getCompanies();
    }

    @PostMapping("/user/bikeDetails")
    public BikeModel getBikeDetails(@RequestBody BikeModel bike) {
        return userService.getBikeDetails(bike);
    }

    @PostMapping("/user/bikes")
    public List<BikeModel> getCompanies(@RequestBody AdminModel admin) {
        return userService.getBikes(admin);
    }

    @PutMapping("/user/edit")
    public UserModel editAdmin(@RequestBody UserModel user) {
        return userService.editUser(user);
    }

    @PostMapping("/user/bookBike")
    public BookingsModel bookBike(BookingsModel booking) {
        return userService.createBooking(booking);
    }
    
    @PostMapping("/user/bookings")
    public List<BookingsModel> userBookings(UserModel user) {
        return userService.getBookings(user);
    }

    // public BookingsModel userGetBookings() {

    // }

}
