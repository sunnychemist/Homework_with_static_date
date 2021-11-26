package com.dashaqaguru;

public class Cats {

    private String name;
    private byte age;
    private String color;
    private boolean isKitten;
    private static int catCount = 0;
    private int weight;

    public Cats(String name, byte age, String color, boolean isKitten) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isKitten = isKitten;
        catCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isKitten() {
        return isKitten;
    }

    public void setKitten(boolean kitten) {
        isKitten = kitten;
    }

    public static int getCatCount(){ return catCount; }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void jump() {
        System.out.println(String.format("cat %s with age %s jumps", name, age));
    }

    public void eat() {
        System.out.println(String.format("%s cat %s with age %s eats", color, name, age));
    }

    public void sleep() {
        System.out.println(String.format("%s %s cat %s with age %s sleeps", isKitten, color, name, age));
    }

    public void play() {
        System.out.println(String.format("cat %s with age %s plays", name, age));
    }
}