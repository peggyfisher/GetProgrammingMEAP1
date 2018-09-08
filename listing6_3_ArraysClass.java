package test;
import java.util.Arrays;
public class ArrayAPIExample {
    public static void main(String[] args) {
       double[] prices = {10.50, 5.75, 13.90, 15, 14.85};
        System.out.println("Print the value of the prices array "
                + "without using the Arrays class: " + prices);
         System.out.println("Print the value of the prices array "
                + "using the Arrays class: " + Arrays.toString(prices));
    } 
}
