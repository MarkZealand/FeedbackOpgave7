package org.example;

public class MilitaryDictator extends Leader implements PowerActions{

    String militaryRank;

    public MilitaryDictator(String name, int age, String country, String militaryRank) {
        super(name, age, country);
        this.militaryRank = militaryRank;
    }


    @Override
    void giveSpeech() {
        //super.giveSpeech();
    }

    @Override
    public void holdParade() {
        PowerActions.super.holdParade();
    }

    @Override
    public void implementPolicy() {
        PowerActions.super.implementPolicy();
    }

    @Override
    public void repressOpposition() {
        PowerActions.super.repressOpposition();
    }
}
