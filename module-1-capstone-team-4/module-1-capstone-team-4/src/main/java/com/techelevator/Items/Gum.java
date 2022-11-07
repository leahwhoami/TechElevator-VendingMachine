package com.techelevator.Items;

import com.techelevator.Vendable;

import java.math.BigDecimal;

public class Gum extends VendingItems {

    public Gum(String slotLocation, String name, BigDecimal price) {
        super(slotLocation, name, price);
    }


    @Override
    public String displayMessage() {
        return "Chew Chew, Yum!";
    }
}
