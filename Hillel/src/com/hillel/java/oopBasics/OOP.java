package com.hillel.java.oopBasics;

/**
 * Created by Mfarsikov on 10.04.2015.
 */
public class OOP {

    public static void main(String[] args) {
        oopIntro();
        int operationResult = new OOP().negativeAge();

        Cat cat1 = new Cat("Tom", 2);
        Cat cat2 = new Cat("Tom", 2);

        int age = 1;

        cat1.setAge(age);

        System.out.println(age);

        System.out.println("they are equal using ==: " + (cat1 == cat2));

        System.out.println("they are equal using equals(): " + cat1.equals(cat2));

    }

    public static void oopIntro() {
        Cat.pawCount();

        System.out.println(Cat.pawCount());

        Cat cat1 = new Cat("Tom", 2);


        System.out.println("default toString: " + cat1);

        Cat cat2 = new Cat("Murzik", 1);

        Vet vet = new Vet();

        Cat cat3 = null;



        vet.registerCat(cat1);
        vet.registerCat(cat2);
        vet.registerCat(cat3);
        vet.print();

        vet.makeVaccine();

        vet.print();

    }

    public int negativeAge(){
        Cat cat = new Cat();
        cat.setAge(-1);
        System.out.println("this message never be printed");
        return 0;
    }

}
