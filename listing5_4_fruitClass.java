package fruit;
import java.util.Scanner;
public class Fruit {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your favorite summer fruit?");
 int choice = 0;
 do {
     System.out.println("1. Apples");
     System.out.println("2. Oranges");
     System.out.println("3. Pears");
     System.out.println("4. Blueberries");
     System.out.println("Choose one: ");
     choice = in.nextInt();
    } while(choice > 4);
 System.out.println("You chose: " + choice);
   }
