package com.example.harshendra.onlinegrocery;

public class Item {

    private String name;
    private int imageId;
    private String price;
    private String quantity;
    private String quantityType;

    public Item(){

    }

    public Item(String name, int image, String price, String quantity, String quantityType) {
        this.name = name;
        this.imageId = image;
        this.price = price;
        this.quantity = quantity;
        this.quantityType = quantityType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }
}
