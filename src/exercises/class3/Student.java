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
    private void setStudentId(int aStudentId){
        this.studentId = aStudentId;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        this.numberOfCredits = aNumberOfCredits;
    }
    private void setGpa(double aGpa){this.gpa = aGpa;}

    public String getGradeLevel() {
        if(this.numberOfCredits < 0){
            return "ERROR: numberOfCredits is negative";
        } else if (this.numberOfCredits < 30){
            return "Freshman";
        } else if (this.numberOfCredits < 60){
            return "Sophomore";
        } else if (this.numberOfCredits < 90){
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public void addGrade(int courseCredits, double grade){
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        setNumberOfCredits(this.numberOfCredits + courseCredits);
        setGpa(totalQualityScore / this.numberOfCredits);
    }

}
