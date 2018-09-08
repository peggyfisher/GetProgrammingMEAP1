import java.lang.Object;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String> (7);
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        Object obj = list.get(2);
        System.out.println("Object value: "+obj.toString() + 
                "\nObject class: " + obj.getClass());       