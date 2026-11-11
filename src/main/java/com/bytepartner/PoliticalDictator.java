package com.bytepartner;

public class PoliticalDictator extends Leader implements PowerActions {

    String partyName;

    public PoliticalDictator(String name, int age, String country, String partyName, int yearsInPower) {
        super(name, age, country);
        this.partyName = partyName;
        this.yearsInPower = yearsInPower; // overskriver den random værdi fra Leader
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Party Name: " + partyName);
    }

    @Override
    void giveSpeech() {
        System.out.println("Political speech: We will bring stability and prosperity to our nation.");
    }

    @Override
    public void consolidatePower() {
        System.out.println("Consolidating power through bribes and manipulation.");
    }

    @Override
    public void holdParade() {
        System.out.println("Organizing a political parade to showcase our party's achievements.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("Repressing opposition through censorship and propaganda.");
    }

    @Override
    public void implementPolicy() {
        System.out.println("Implementing policy through strict party regulations and control.");
    }
}