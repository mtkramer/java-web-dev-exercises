package exercises.class3;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public Student(String name, int studentId){
        this(name, studentId, 0,0.0);
    }

    public String getName(){
        return this.name;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }
    public double getGpa(){
        return this.gpa;
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setStudentId(int aStudentId){
        this.studentId = aStudentId;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }
    private void setGPA(double aGpa){
        this.gpa = aGpa;
    }

}
