import models.Student;
import models.Person;
import models.School;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File studentsFile = new File("data/students.txt");
        File teachersFile  = new File("data/teachers.txt");
        Scanner scStudents = new Scanner(studentsFile);
        Scanner scTeachers  = new Scanner(teachersFile);
        School school = new School();

        while (scStudents.hasNext()) {
            String name = scStudents.next();
            String surname = scStudents.next();
            int age = scStudents.nextInt();
            String genderStr = scStudents.next();
            boolean gender = genderStr.equals("Male");

            Student student = new Student(name, surname, age, gender);

            while (scStudents.hasNextInt()) {
                int grade = scStudents.nextInt();
                student.addGrade(grade);
            }
            school.addMember(student);
        }

        while (scTeachers.hasNext()) {
            String name = scTeachers.next();
            String surname = scTeachers.next();
            int age = scTeachers.nextInt();
            String genderStr = scTeachers.next();
            boolean gender = genderStr.equals("Male");
            String subject = scTeachers.next();
            int yearsExperience = scTeachers.nextInt();
            int salary = scTeachers.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsExperience, salary);

            if (yearsExperience >= 10) {
                teacher.giveRaise(20);
            }

            school.addMember(teacher);
        }

        System.out.println(school);
    }
}