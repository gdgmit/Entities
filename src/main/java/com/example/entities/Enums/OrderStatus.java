package com.example.entities.Enums;

public enum OrderStatus {
    PENDING, ORDERED, DELIVERED, FAILED
    //Pending - when order is initially created (before payment successful)
    //Ordered - once order payment is successful
    //Delivered - after supplying the item
    //Failed - if order expired (At EOD for every day)
}