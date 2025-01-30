package com.hamidat.nullpointers;

public abstract class Shape {
    private int x;
    private int y;
<<<<<<< HEAD
    String color = "yellow";
=======
>>>>>>> origin/main

    // Constructor for the abstract class
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
