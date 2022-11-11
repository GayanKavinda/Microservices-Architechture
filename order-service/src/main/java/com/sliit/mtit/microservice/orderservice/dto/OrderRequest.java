package com.sliit.mtit.microservice.orderservice.dto;

import java.util.StringJoiner;

public class OrderRequest {
    private String itemName;
    private String price;
    private String itemType;
    private String itemDetails;

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

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OrderRequest.class.getSimpleName() + "[", "]")
                .add("itemName='" + itemName + "'")
                .add("price='" + price + "'")
                .add("itemType='" + itemType + "'")
                .add("itemDetails='" + itemDetails + "'")
                .toString();
    }
}
