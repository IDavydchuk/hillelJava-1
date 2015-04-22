package com.hillel.java.Inheritance;

import com.hillel.java.dataStructures.ArrayList.ImprovedArray;

import java.util.ArrayList;

/**
 * Created by Mfarsikov on 22.04.2015.
 */
public class InheritanceMain {
    public static void main(String[] args) {


    }

    public static void inconvinienWay() {
        Employee employee = new Employee("Ivan", "dsf");
        Person employeeAsPerson = employee;
        Object employeeAsObject = employeeAsPerson;

        register(employee);
        register(employeeAsPerson);

        ArrayList array = new ArrayList();
        array.add(employee);
        array.add(employeeAsPerson);
        array.add(employeeAsObject);

        employee = (Employee) array.get(0);
        employeeAsPerson = (Person) array.get(1);
        employeeAsObject = array.get(2);

        if (employeeAsPerson instanceof Employee) {
            employee = (Employee) employeeAsPerson;
        }

        if(employee instanceof Person){
            System.out.println("realy? )");
        }
    }

    public static void register(Person person) {
        System.out.println("registered " + person.getName());
    }

    public static void constructors() {
        //Person person = new Person("Ivan");

        Employee employee = new Employee("Petro", "IT");

        //employee = new Employee("vasya");
    }

    public static void simpleExample() {
      /*  Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setName("Petro");
        employee.setDepartment("IT");*/
    }
}
