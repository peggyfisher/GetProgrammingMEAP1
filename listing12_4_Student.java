
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Comparable {  //#A

    static Scanner in = new Scanner(System.in);
    static int ID = 500;             //#B
    private String fName, lName;     //#C
    private int studentId;  //#C
    private double GPA;  //#C
    static String collegeName = "Penn State University"; //#D

    public void readStudentInfo() {  //#E     
        System.out.println("Enter the student information (first name, last name,"
                + "GPA");
        String info = in.nextLine();  //#E     
        String[] parsedInfo = info.split(",");  //#F     
        this.fName = parsedInfo[0];  //#G
        this.lName = parsedInfo[1];  //#G
        this.GPA = Double.parseDouble(parsedInfo[2]);  //#G
        this.studentId = ID++;  //#H

    }

    public int compareTo(Object obj) {  //#I
        Student s = (Student) obj;  //#I
        if (this.GPA > s.GPA) //#I
        {
            return 1;  //#I
        } else //#I
        {
            return -1; //#I
        }
    }//#I

    @Override
    public String toString() {
        return fName + " " + lName + ", Student ID: " + ID + " GPA: " + GPA
                + ",University: " + collegeName + "\n";
    }

    public static void main(String[] args) {
        boolean done = false;
        String response = "y";
        ArrayList<Student> roster = new ArrayList<Student>();
        while (done == false) {
            Student s = new Student();
            s.readStudentInfo();
            roster.add(s);
            System.out.println("More students: (Y/N)");
            response = in.next().toLowerCase();
            in.nextLine();
            if (response.equals("n")) {
                done = true;
            }
        }
        StringBuilder output = new StringBuilder();  //#J
        for (Student s_info : roster) {
            output.append(s_info.toString());  //#J
        }
        System.out.println(output);
        double highest = roster.get(0).GPA;
        int highestIndex = 0;
        double total = roster.get(0).GPA, average;
        for (int i = 1; i < roster.size(); i++) {
            total += roster.get(i).GPA;
            if (roster.get(i).GPA > highest) {
                highestIndex = i;
                highest = roster.get(i).GPA;
            }
        }
        average = total / roster.size();
        System.out.println("The student with the highest GPA is: "
                + roster.get(highestIndex).toString());
        System.out.println("Average GPA is: " + average);
    }
}
