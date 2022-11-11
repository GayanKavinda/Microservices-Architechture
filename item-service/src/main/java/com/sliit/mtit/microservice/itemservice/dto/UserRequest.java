package com.sliit.mtit.microservice.itemservice.dto;

import java.util.StringJoiner;

public class UserRequest {
    private String itemName;
    private String price;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserRequest.class.getSimpleName() + "[", "]")
                .add("itemName='" + itemName + "'")
                .add("price='" + price + "'")
                .toString();
    }
}
