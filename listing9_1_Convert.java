import java.util.ArrayList;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    double total = 0, average = 0;
    System.out.println("Enter a list of integers separated by commas and spaces, " +         
        "ie: 1, 2, 3, etc.");
    String input = in.nextLine();
    String[] strNumbers = input.split(", ");         //#A
    for(int i = 0; i<strNumbers.length; i++) {
       arrList.add(Integer.valueOf(strNumbers[i]));  //#B
       total += arrList.get(i);
     }
     average = total/arrList.size();
     System.out.printf("The average of the numbers is: %.2f%n", average);   //#C
     for(int j = 0; j < strNumbers.length; j++) {
        System.out.println(Integer.parseInt(strNumbers[j]));     //#D
   } 
}
}