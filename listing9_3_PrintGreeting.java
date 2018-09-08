import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder greeting = new StringBuilder();   //#A
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        greeting.append("Hello, ");      //#B
        greeting.append(name);           //#C
        System.out.println(greeting);
    }   
}