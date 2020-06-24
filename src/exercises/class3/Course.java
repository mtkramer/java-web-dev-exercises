package exercises.class3;

import java.util.List;

public class Course{

    List<String> registeredStudents;
    double credit = 5;
    double hoursPerWeek = 6;

    public List<String> getRegisteredStudents() {
        return registeredStudents;
    }
    public double getCredit() {
        return credit;
    }
    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void addStudent(Student student){
        this.registeredStudents.add(student.getName());
    }

}