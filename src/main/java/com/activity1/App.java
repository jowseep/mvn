package com.activity1;

import com.Person.*;
import com.Vehicle.*;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Student newStudent = new Student("Joseph", "Callao", 23, 4);
        Teacher newTeacher = new Teacher("Kim", "Ortiz", 25, "Biology");
        Car newCar = new Car(4, 2, 250);
        Bike newBike = new Bike(2, 1, 500);

        newStudent.introductSelf();
        newTeacher.introductSelf();
        newCar.showInfo();
        newBike.showInfo();
    }
}
