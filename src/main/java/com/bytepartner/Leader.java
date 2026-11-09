package org.example;

public abstract class Leader {

    String name;
    String country;
    int yearsInPower;

    public Leader(String name, int age, String country) {
    }

    void giveSpeech(){
        System.out.println("Generic leader speech. Pure propaganda.");
    }
    void printDetails(){
        System.out.println("Navn: " + name + " Land:" + country);
    }
}
