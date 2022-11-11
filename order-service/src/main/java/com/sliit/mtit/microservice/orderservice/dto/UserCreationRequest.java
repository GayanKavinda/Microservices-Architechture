package com.sliit.mtit.microservice.orderservice.dto;

    public class UserCreationRequest {
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

    }

