import java.util.Arrays;
public class Test {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    int[] numbers2 = {2, 3, 4, 5, 6, 7, 8};
    if(Arrays.equals(numbers,numbers2))   //#A
      System.out.println("The two arrays are equal! ");
    else
      System.out.println("The two arrays are not equal! ");
    System.out.println("First array: " + Arrays.toString(numbers)); //#B
    System.out.println("Second array: " + Arrays.toString(numbers2));
    }
}
