package exercises.class3;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Double.compare(course.credit, credit) == 0 &&
                Double.compare(course.hoursPerWeek, hoursPerWeek) == 0 &&
                Objects.equals(registeredStudents, course.registeredStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registeredStudents, credit, hoursPerWeek);
    }

    @Override
    public String toString() {
        return "Course{" +
                "registeredStudents=" + registeredStudents +
                ", credit=" + credit +
                ", hoursPerWeek=" + hoursPerWeek +
                '}';
    }
}