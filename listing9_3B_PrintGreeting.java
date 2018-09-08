import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder greeting = new StringBuilder();
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        greeting.append("Hello, ");
        greeting.append(name);
        greeting.insert(6, "and Welcome,");  //#A
        System.out.println(greeting);
    }   
}