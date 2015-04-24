package com.hillel.java.advancedOOP.quack;

/**
 * Created by Mfarsikov on 24.04.2015.
 */
public class Silence implements QuackBehavior {
    @Override
    public String quack() {
        return "<silence>";
    }
}
