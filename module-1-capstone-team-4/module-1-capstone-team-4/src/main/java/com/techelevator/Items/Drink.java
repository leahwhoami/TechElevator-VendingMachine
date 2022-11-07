package com.techelevator.Items;

import com.techelevator.Vendable;

import java.math.BigDecimal;

public class Drink extends VendingItems {

    public Drink(String slotLocation, String name, BigDecimal price) {
        super(slotLocation, name, price);
    }


    @Override
    public String displayMessage() {
        return "Glug Glug, Yum!";
    }
}
