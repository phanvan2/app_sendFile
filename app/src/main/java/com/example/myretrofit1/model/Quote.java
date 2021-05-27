package com.example.myretrofit1.model;

public class Quote {
    private float USDVND ;

    public Quote(float USDVND) {
        this.USDVND = USDVND;
    }

    public float getUSDVND() {
        return USDVND;
    }

    public void setUSDVND(float USDVND) {
        this.USDVND = USDVND;
    }
}
