package lesson16_example;

public class Student {

    private String firstName, lastName;
    private int age, grade;
    private double myGPA;

    public Student(String firstName, String lastName, int age, int grade,
            double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.myGPA = gpa;
    }

    public double getGPA() {
        return myGPA;
    }

    @Override                              
    public String toString() {
        String gradeInfo;
        switch (grade) {                    
            case 9:
                gradeInfo = "Freshman";
                break;
            case 10:
                gradeInfo = "Sophomore";
                break;
            case 11:
                gradeInfo = "Junior";
                break;
            case 12:
                gradeInfo = "Senior";
                break;
            default:
                gradeInfo = "Invalid year";
                break;
        }
        return "Student Name = " + firstName + " " + lastName + " " + "Age = "
                + age + " Year = " + gradeInfo + "\n";
    }
}
