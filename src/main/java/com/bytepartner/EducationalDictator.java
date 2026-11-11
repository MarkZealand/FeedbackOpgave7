package com.bytepartner;

public class EducationalDictator extends Leader implements PowerActions{

    String university;

    public EducationalDictator(String name, int age, String country, String university) {
        super(name, age, country);
        this.university = university;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("University: " + university);
    }
    @Override
    void giveSpeech() {
        System.out.println("Educational speech: Here's your homework for the next week. You're welcome!");
    }

    @Override
    public void holdParade() {
        System.out.println("Organizing a parade to celebrate academic achievements.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("Implementing policy through mandatory study hours.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("Repressing opposition through strict academic regulations.");
    }

    @Override
    public void consolidatePower() {
        System.out.println("Consolidating power through plenty of homework.");
    }
}
