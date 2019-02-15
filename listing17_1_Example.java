package lesson17_examples;

public class Lesson17_Examples {

    public static void main(String[] args) {
        int x = 35;
        int y = 5;
        if (x == y) 
        {
            System.out.println("x is equal to y");
        }

        Person p1 = new Person("Cy", "Young", 35);
        Person p2 = new Person("cy", "young", 35);
        if (p1 == p2) 
        {
            System.out.println("p1 is equal to p2");
        }
        if (p1.age == p2.age) {
            System.out.println("p1 age is equal to p2 age");
        }
        if (x == p1.age) {
            System.out.println("x is equal to p1 age");  
        }
    }
}

class Person {

    String fname, lname;
    int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
}
