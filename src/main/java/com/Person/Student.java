package com.Person;

public class Student extends Person {
    
    private int yearLevel;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        super(firstName, lastName, age);
        this.yearLevel = yearLevel;
    }

    public void introductSelf() {
        System.out.println("\n");
        System.out.println("Hi, I'm " + getFirstName() + " " + getLastName() + " and I am " + getAge()+ " years old.");
        System.out.println("I am a " + yearLevel + "-year level in college.");
    }
}
