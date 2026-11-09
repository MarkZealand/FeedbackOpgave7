package org.example;

public class EducationalDictator extends Leader implements PowerActions{

    String educationPolicy;

    public EducationalDictator(String name, int age, String country, String educationPolicy) {
        super(name, age, country);
        this.educationPolicy = educationPolicy;
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
