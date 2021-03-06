package com.hillel.java.advancedOOP.duck;

import com.hillel.java.advancedOOP.fly.FlyBehavior;
import com.hillel.java.advancedOOP.quack.QuackBehavior;

/**
 * Created by Mfarsikov on 24.04.2015.
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return "I'm swimming";
    }

    public abstract String display();
}
