package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bookings")
public class BookingsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="user_id")
    private Long userID;
    @Column(name="bike_id")
    private Long bikeID;
    @Column(name="bike_model")
    private String bikeModel;
    @Column(name="rent" , columnDefinition = "integer default 0")
    private Long rent;
    @Column(name="days", columnDefinition = "integer default 0")
    private Long days;
    @Column(name="total_price", columnDefinition = "integer default 0")
    private Long totalPrice;
    public BookingsModel() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserID() {
        return userID;
    }
    public void setUserID(Long userID) {
        this.userID = userID;
    }
    public Long getBikeID() {
        return bikeID;
    }
    public void setBikeID(Long bikeID) {
        this.bikeID = bikeID;
    }

    public BookingsModel(Long id, Long userID, Long bikeID, String bikeModel, Long rent, Long days, Long totalPrice) {
        this.id = id;
        this.userID = userID;
        this.bikeID = bikeID;
        this.bikeModel = bikeModel;
        this.rent = rent;
        this.days = days;
        this.totalPrice = totalPrice;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public Long getRent() {
        return rent;
    }

    public void setRent(Long rent) {
        this.rent = rent;
    }

    public Long getDays() {
        return days;
    }

    public void setDays(Long days) {
        this.days = days;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

}
