package com.bytepartner;

public abstract class Leader {

    String name;
    String country;
    int age;
    int yearsInPower;

    public Leader(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.yearsInPower = (int) (Math.random() * 20) + 1;
    }

    abstract void giveSpeech();

    void printDetails() {
        System.out.println("Name: " + name
                + "\nAge: " + age
                + "\nYears in power: " + yearsInPower
                + "\nCountry: " + country);
    }
}