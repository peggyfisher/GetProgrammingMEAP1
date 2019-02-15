package lesson18_example;

import java.time.LocalDate;

import java.util.ArrayList;

public class Project implements Comparable {

    //Please see Listing 18.1 for the omitted code   
    public void printPayroll() {
        System.out.println("Payroll Report for Project: " + getName());
        System.out.println("(Salary only)");
        for (Worker w : workers) {
            if (w instanceof Plumber) 
            {
                System.out.print("Plumbing costs: ");
            } else if (w instanceof Electrician) {
                System.out.print("Electrician: ");
            } else if (w instanceof Carpenter) {
                System.out.print("Carpenter: ");
            }
            System.out.println(w.fName + " " + w.lName + "\n"
                    + "ID number: " + w.idNumber + "\n"
                    + w.address.toString()
                    + "\nHourly Rate: " + w.hourlyRate
                    + "\nHours worked: " + w.hoursWorked
                    + "\nTotal Compensation: $" + w.hourlyRate * w.hoursWorked
                    + "\n================" + "\n");
        }
    }
}