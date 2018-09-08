import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> iceCream = new ArrayList<String>();  //#A
        iceCream.add("Vanilla");       //#B
        iceCream.add("Chocolate");     //#B
        iceCream.add("Strawberry");    //#B
        iceCream.add("Teaberry");      //#B
        System.out.println("Elements in the iceCream ArrayList: " 
            + iceCream);

        ArrayList<String> flavors = new ArrayList<String>();
        flavors.add("Fudge");
        flavors.add("Neopolitan");
        System.out.println("Elements in flavors: " + flavors);

        iceCream.addAll(flavors);       //#C
        System.out.println("Ice Cream plus flavors: " + iceCream);
    }
}