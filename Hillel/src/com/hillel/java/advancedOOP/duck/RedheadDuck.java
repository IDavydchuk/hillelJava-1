package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.Fly;
import com.hillel.java.advancedOOP.fly.FlyBehavior;
import com.hillel.java.advancedOOP.quack.Quack;
import com.hillel.java.advancedOOP.quack.QuackBehavior;

/**
 * Created by Mfarsikov on 24.04.2015.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
        return "Redhead duck";
    }
}
