package com.bytepartner;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Main {
    List<Leader> dictators = new ArrayList<>();

    void main() {
        Scanner input = new Scanner(System.in);
        setupDictators(input);
        listDictators();
    }

    private void listDictators() {
        for (Leader dictator : dictators) {
            dictator.printDetails();
            dictator.giveSpeech();

            //Tænker, at det måske giver lidt mere mening at bruge en switch case her,
            // men opgaven bad om at bruge instanceof, så det her var vel sådan set et fornuftigt sted at bruge dem.
            if (dictator instanceof PowerActions action) {
                action.implementPolicy();
                action.repressOpposition();
                action.holdParade();
                action.consolidatePower();
            }
            System.out.println(); // luft mellem hver
        }
    }

    private void setupDictators(Scanner input) {
        System.out.println("Generating dictators...");
        System.out.println("How many EXTRA dictators would you like to generate? (0-6)");

        //Prøver også at inkludere en try/catch metode her, da vi netop har gennemgået det i undervisningen.
        try {
            int dictatorCount = parseInt(input.nextLine());
            if (dictatorCount < 0 || dictatorCount > 6) {
                throw new IllegalArgumentException("Number out of range");
            }
            generateDictators(dictatorCount);
        }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a number between 0 and 6.");
            setupDictators(input);
        }
    }

    private void generateDictators(int dictatorCount) {
        MilitaryDictator milDic = new MilitaryDictator("Dictator 1", 45, "Country 1", "General");
        PoliticalDictator polDic = new PoliticalDictator("Dictator 2", 50, "Country 2", "Party 1", 10);
        EducationalDictator eduDic = new EducationalDictator("Dictator 3", 40, "Country 3", "University 1");
        dictators.add(milDic);
        dictators.add(polDic);
        dictators.add(eduDic);
        for (int i = 0; i < dictatorCount; i++) {
            int dictatorType = (int) (Math.random() * 3);
            Leader dictator;

            switch (dictatorType) {
                case 0:
                    dictator = new MilitaryDictator("Dictator " + (i + 4), (int) (Math.random() * 40) + 30, "Country " + (i + 1), "General");
                    break;
                case 1:
                    dictator = new PoliticalDictator("Dictator " + (i + 4), (int) (Math.random() * 40) + 30, "Country " + (i + 1), "Party " + (i + 1), 10);
                    break;
                case 2:
                    dictator = new EducationalDictator("Dictator " + (i + 4), (int) (Math.random() * 40) + 30, "Country " + (i + 1), "University " + (i + 1));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + dictatorType);
            }
            dictators.add(dictator);
        }
    }
}
