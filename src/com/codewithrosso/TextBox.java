package com.codewithrosso;

public class TextBox extends UIControl{
    private String text = "";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }

    @Override
    public void render() {
        System.out.println("render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
