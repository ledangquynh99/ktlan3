package com.example.thecoffeehouse;

public class orderItem {
    String title119,price119;
    Integer image119;

    public orderItem(String title, String price, Integer image) {
        this.title119 = title;
        this.price119 = price;
        this.image119 = image;
    }

    public String getTitle() {
        return title119;
    }

    public void setTitle(String title) {
        this.title119 = title;
    }

    public String getPrice() {
        return price119;
    }

    public void setPrice(String price) {
        this.price119 = price;
    }

    public Integer getImage() {
        return image119;
    }

    public void setImage(Integer image) {
        this.image119 = image;
    }
}
