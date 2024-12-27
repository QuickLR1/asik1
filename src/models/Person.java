package models;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String surname;
    int age;
    boolean gender; // True - Man; False - Girls :))


    Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String charGender;
        if (gender) {
            charGender = "Male";
        } else {
            charGender = "Female";
        }


        return ("Hi, I am " + name + " " + surname + ",a " + age + "-year-old" + " " + charGender);
    }
}


