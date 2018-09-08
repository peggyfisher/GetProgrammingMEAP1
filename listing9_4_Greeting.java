import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder greeting = new StringBuilder();
        System.out.println("Enter a series of names separated by commas:");
        String names = in.nextLine();
        String[] name = names.split(", ");               //#A
        greeting.append("Hello, . How are you today?");  //#B
        for(int i = 0;i<name.length;i++) {               
            greeting.insert(7, name[i]);                 //#C
            System.out.println(greeting);                //#C
            greeting.delete(7,(7+name[i].length()));     //#D
        }   
    }   
}