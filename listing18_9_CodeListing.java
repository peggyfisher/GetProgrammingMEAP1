package lesson18_example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Lesson18_Example {

    public static void main(String[] args) {
        //Please see Listing 18.7 for the omitted code   //#A
        System.out.println("\n\n");
        house.printPayroll();        //#B
//        System.out.printf(house.toString(), house.getName(),
//                house.getTotalCost(), house.getOverhead());
//        System.out.println("***************************************************"
//                + "\n***************************************************\n");

        workers.remove(p);  //project 2 does not need a plumber
        workers.remove(c);  //project 2 does not need a carpenter
        ((Electrician) e).setWiringCosts(300);
        workers.get(0).hoursWorked = 20;  //set the hours worked to 20
        project2.addWorkers(workers);
//        System.out.printf(project2.toString(), project2.getName(),
//                project2.getTotalCost(), project2.getOverhead());
//
//        if (project2.compareTo(house) < 0) {
//            System.out.println("\nThe outdoor light project is scheduled "
//                    + "before the addition");
//        } else {
//            System.out.println("\nThe addition is scheduled prior to the "
//                    + "outdoor lighting project");
//        }
        System.out.println("\n");
        project2.printPayroll();      //#B
    }
}
