package com.hillel.java.Inheritance;

/**
 * Created by Mfarsikov on 22.04.2015.
 */
public class Employee extends Person {

    private String department;

    public String field = "Eployee's field";

    public Employee(String name, String department) {
        super(name);
        this.department = department;
        System.out.println("creating Employee");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String someMethod() {
        return "Employee's overridden method. Method see: {field: " + field + ", static method: " + staticMethod() + "}";
    }

    public static String staticMethod() {
        return "Employee's static method";
    }
}
