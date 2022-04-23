package com.Person;

public class Teacher extends Person {
    
    String degree;

    public Teacher(String firstName, String lastName, int age, String degree) {
        super(firstName, lastName, age);
        this.degree = degree;
    }

    public void introductSelf() {
        System.out.println("\n");
        System.out.println("Hi, I'm " + getFirstName() + " " + getLastName() + " and I am " + getAge()+ " years old.");
        System.out.println("I have a degree in " + degree + ".");
    }
    
}