package com.example.thecoffeehouse;

import android.widget.Spinner;

public class itemmap {
    String namestore119,mota119;
    String x119,y119;
    Integer image119;

    public itemmap(String namestore, String mota, String x, String y, Integer image) {
        this.namestore119 = namestore;
        this.mota119 = mota;
        this.x119 = x;
        this.y119 = y;
        this.image119=image;
    }

    public String getNamestore() {
        return namestore119;
    }

    public void setNamestore(String namestore) {
        this.namestore119 = namestore;
    }

    public String getMota() {
        return mota119;
    }

    public void setMota(String mota) {
        this.mota119 = mota;
    }


    public Integer getImage() {
        return image119;
    }

    public void setImage(Integer image) {
        this.image119 = image;
    }

    public String getX() {
        return x119;
    }

    public void setX(String x) {
        this.x119 = x;
    }

    public String getY() {
        return y119;
    }

    public void setY(String y) {
        this.y119 = y;
    }
}
