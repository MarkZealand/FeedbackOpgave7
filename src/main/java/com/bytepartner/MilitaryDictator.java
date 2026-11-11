package com.bytepartner;

public class MilitaryDictator extends Leader implements PowerActions{

    String militaryRank;

    public MilitaryDictator(String name, int age, String country, String militaryRank) {
        super(name, age, country);
        this.militaryRank = militaryRank;
    }

    @Override
    void printDetails() {
        super.printDetails();
        System.out.println("Military Rank: " + militaryRank);
    }

    @Override
    void giveSpeech() {
        System.out.println("Military speech: We will defend our nation with honor and strength.");
    }

    @Override
    public void holdParade() {
        System.out.println("Organizing a military parade to showcase our strength.");
    }

    @Override
    public void implementPolicy(){
        System.out.println("Implementing policy through strict military regulations.");
    }

    @Override
    public void repressOpposition() {
        System.out.println("Repressing opposition through strict military regulations.");
    }

    @Override
    public void consolidatePower() {
        System.out.println("Consolidating power through military might.");
    }
}
