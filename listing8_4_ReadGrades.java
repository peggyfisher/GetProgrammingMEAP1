import java.util.ArrayList;
import java.util.Scanner;
public class Grades {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);       
      ArrayList<Double> grades = new ArrayList<Double>(); //#A
      System.out.println("Enter first grade: ");
      double value = in.nextDouble();     //#B
      while (value >= 0) {
         grades.add(value);   //#C
         System.out.println("Enter next grade: ");
         value = in.nextDouble();
      }
      double total = 0, count = 0;
      for(double s: grades) {       //#D
         total += s;
         count++;
      }
      System.out.printf("\nThe average scores is: %.2f \n",
          (total/count));
 }
}