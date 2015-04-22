package com.hillel.java.Inheritance;

/**
 * Created by Mfarsikov on 22.04.2015.
 */
public class Person extends Object {

    private String name;

  /*  public Person(){
        super();
        System.out.println("creating Person");
    }*/

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
