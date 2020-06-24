package exercises.class3;

import java.util.HashMap;
import java.util.Map;

public class SchoolPractice {

    public static void main(String[] args) {
        Map<String, Integer> classList = new HashMap<>();
        Student me = new Student("Mike", 22, 90, 4.0);
        Course LC101 = new Course();
        LC101.addStudent(me);
    }

}
