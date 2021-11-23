package com.dashaqaguru;

public class Methods {
    public static void main(String[] args) {
        Cats cat = new Cats("Barsik", (byte) 5, "black", false);
        cat.jump ();
        cat.eat();
        cat.sleep();
        cat.play();

        Cats cat2 = new Cats( "Vasya", (byte) 3, "grey", false);
    }
}

