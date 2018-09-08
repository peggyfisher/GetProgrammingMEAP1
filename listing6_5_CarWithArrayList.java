import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String fName, lName, email, courseName;
    public String getfName() {
        return fName; }
    public void setfName(String fName) {
        this.fName = fName; }
    public String getlName() {
        return lName; }
    public void setlName(String lName) {
        this.lName = lName; }
    public String getEmail() {
        return email; }
    public void setEmail(String email) {
        this.email = email; }
    public String getCourseName() {
        return courseName; }
    public void setCourseName(String courseName) {
        this.courseName = courseName; } 
    public String toString() {
         return fName + " " + lName + ", email: "+ email + ", course: " + 
                courseName ;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName, lastName, emailAddress, course;
        boolean done = false;

        ArrayList<Student> roster = new ArrayList<Student>();  //#A
     while (!done) {
        System.out.println("Enter first name, last name, email, and " + 
        "course name ");
     firstName = in.nextLine();
        lastName = in.nextLine();
        emailAddress = in.nextLine();
        course = in.nextLine();
        Student s = new Student();      //#B
        s.setfName(firstName);          //#B
        s.setlName(lastName);           //#B
        s.setEmail(emailAddress)        //#B
        s.setCourseName(course);        //#B
        roster.add(s);                  //#C
        System.out.println("Want to enter another student? (y/n) ");           
        if (in.nextLine().equalsIgnoreCase("n")) {
              done = true;
        }
     }
     System.out.println("These are the students in the course: ");
     System.out.println(roster);
     System.out.println("There are " + roster.size() + " students\n");
     roster.remove(0);                 //#D     
     Student newStudent = new Student();
     newStudent.setfName("Pat");
     newStudent.setlName("Slattery");
     newStudent.setEmail("patSlattery@aol.com");
     newStudent.setCourseName("English");
     roster.set(1, newStudent);        //#E
     System.out.println("Students remaining: ");
     System.out.println(roster);
     System.out.println("There are " + roster.size() + " students\n");
   }  
}