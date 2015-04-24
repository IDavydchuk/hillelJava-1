package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.FlyBehavior;
import com.hillel.java.advancedOOP.fly.FlyNoWay;
import com.hillel.java.advancedOOP.quack.QuackBehavior;
import com.hillel.java.advancedOOP.quack.Silence;

/**
 * Created by Mfarsikov on 24.04.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new FlyNoWay(), new Silence());
    }

    @Override
    public String display() {
        return "Rubber duck";
    }
}
