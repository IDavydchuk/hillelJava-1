package com.hillel.java.oopBasics;

import java.util.Arrays;

/**
 * Created by Mfarsikov on 10.04.2015.
 */
public class Vet {

    Cat[] vetList = new Cat[10];

    int registered = 0;

    public void registerCat(Cat cat) {
        if(cat != null) {
            vetList[registered] = cat;
            registered++;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(vetList));
    }

    public void makeVaccine() {
        for (int i = 0; i < registered; i++) {
            Cat cat = vetList[i];
            cat.acceptVaccine(Vaccine.BCG);
            cat.acceptVaccine(Vaccine.SOME_OTHER);
        }
    }
}
