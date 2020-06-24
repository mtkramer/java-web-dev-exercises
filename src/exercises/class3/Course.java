package exercises.class3;

import java.util.List;

public class Course{

    private List<String> registeredStudents;
    private final double credit = 5;
    private final double hoursPerWeek = 6;

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
        this.registeredStudents.add(student.name);
    }

}