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

/*
What access modifier restricts access the most for what we need?
If it is a field, could we restrict the access to private and use getters and setters?
If we do set fields to private, what access level do we have to give our getters and setters?
 */