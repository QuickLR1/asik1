package models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    static int studentIDCounter = 0;
    int studentID;
    public List<Integer> grages;
    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = ++studentIDCounter;
        this.grages = new ArrayList<>();
    }

    //addCrage Method
    public void addGrade(int grade) {
        if(grade >= 0 && grade <= 100) {
            grages.add(grade);
        }else{
            System.out.println("Nepravil'naya ocenka");
        }
    }

    // calculateGPA method
    public double calculateGPA() {
        int n = this.grages.size();
        double sum = 0;
        for(int i = 0; i < n; i++) {
            int grade = grages.get(i);

            if (grade >= 50 && grade <= 54) {
                sum += 1;
            } else if (grade >= 55 && grade <= 59) {
                sum += 1.33;
            } else if (grade >= 60 && grade <= 64) {
                sum += 1.67;
            } else if (grade >= 65 && grade <= 69) {
                sum += 2.0;
            } else if (grade >= 70 && grade <= 74) {
                sum += 2.33;
            } else if (grade >= 75 && grade <= 79) {
                sum += 2.67;
            } else if (grade >= 83 && grade <= 84) {
                sum += 3.0;
            } else if (grade >= 85 && grade <= 89) {
                sum += 3.33;
            } else if (grade >= 90 && grade <= 94) {
                sum += 3.67;
            } else if (grade >= 95 && grade <= 100) {
                sum += 4.0;
            }
        }
        return (double)sum/n;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID- " + studentID + " " + calculateGPA();
    }

}