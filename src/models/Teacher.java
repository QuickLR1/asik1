package models;

// Teacher Class
public class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    double salary;
    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    //Method giveRaise
    public void giveRaise(double percent) {
        this.salary += salary * percent / 100;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + "." + "My Salary " + salary;
    }
}

