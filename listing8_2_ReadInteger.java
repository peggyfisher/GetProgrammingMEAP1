import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter an integer: ");
        while(!in.hasNextInt()) {    //#A
           System.out.println("Invalid value, enter an integer");
           in.nextLine();    //#B
        }
        count = in.nextInt();  //#C
    }
}