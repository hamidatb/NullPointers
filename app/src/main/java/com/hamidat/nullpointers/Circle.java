package com.hamidat.nullpointers;

public class Circle extends Shape {
    protected String color;
    public Circle(int x, int y) {
        super(x,y);
        this.color = "red";
    }
}
