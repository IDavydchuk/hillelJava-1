package com.hillel.java.oopBasics;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Mfarsikov on 10.04.2015.
 */
public class Cat {

    static final int pawCount = 4;

    public final String name ;
    private int age;
    private Vaccine vaccines[] = new Vaccine[10];
    private int vaccineCount = 0;
    private String ownerName;

    public Cat(String name) {
        this(name, 0);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this("noname");
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            throw new RuntimeException("Incorrect age value: " + age);
        }
        this.age = age;
    }

    public Vaccine[] getVaccines() {
        return vaccines;
    }

    public void setVaccines(Vaccine[] vaccines) {
        this.vaccines = vaccines;
    }

    public String toString() {
        String result = "com.hillel.java.oopBasics.Cat ";
        result += name + " ";
        result += age + " years";
        result += Arrays.toString(vaccines);
        return result;
    }

    public void acceptVaccine(Vaccine vaccine) {
        vaccines[vaccineCount] = vaccine;
        vaccineCount++;
    }

    public static int pawCount() {
        return pawCount;
    }

    public static Cat createCat() {
        return new Cat("sdf", 1);
    }


    public static void main(String[] args) {
        Cat cat = new Cat("sdf", 1);

    }

    public boolean equals(Object other) {
        if (other instanceof Cat) {
            Cat otherCat = (Cat) other;
            if (this.age != otherCat.age) {
                return false;
            }
            if (!this.name.equals(otherCat.name)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
