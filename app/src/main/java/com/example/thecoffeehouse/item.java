package com.example.thecoffeehouse;

public class item {
    String title119,text119,bt119;
    Integer image119;

    public item(String title, String text, String bt, Integer image) {
        this.title119 = title;
        this.text119 = text;
        this.image119 = image;
        this.bt119=bt;
    }

    public String getTitle() {
        return title119;
    }

    public void setTitle(String title) {
        this.title119 = title;
    }

    public String getText() {
        return text119;
    }

    public void setText(String text) {
        this.text119 = text;
    }

    public String getBt() {
        return bt119;
    }

    public void setBt(String bt) {
        this.bt119 = bt;
    }

    public Integer getImage() {
        return image119;
    }

    public void setImage(Integer image) {
        this.image119 = image;
    }
}
