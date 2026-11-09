package org.example;

public class PoliticalDictator  extends Leader implements PowerActions{

    String partyName;
    int yearsInPower;

    public PoliticalDictator(String name, int age, String country, String partyName, int yearsInPower) {
        super(name, age, country);
        this.partyName = partyName;
        this.yearsInPower = yearsInPower;
    }


}
