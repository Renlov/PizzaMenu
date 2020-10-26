package com.example.pizza;

public class CardResource {

    private int ImageResource;
    private String text1;
    private String text2;

    public CardResource(int imageResource, String text1, String text2) {
        ImageResource = imageResource;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageResource() {
        return ImageResource;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
