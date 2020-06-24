package exercises.class3;

public class Teacher {
    public String firstName;
    public String lastName;
    public String subject;
    private int yearsTeaching;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    private void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
