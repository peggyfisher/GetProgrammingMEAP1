package lesson17_examples;

public class Lesson17_Examples {

    public static void main(String[] args) {
        Person p1 = new Person("Sheila", "Gelin", 35);
        Person p2 = new Person("Sheila", "Gelin", 35);
        Person p3 = new Person("Ray", "Villalobos", 25);
        if (p1.equals(p2)) {
            System.out.println("p1 is equal to p2");
        }
        if (p1.equals(p3)) {
            System.out.println("p1 is equal to p3");
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

    public boolean equals(Object obj) {      //#A       
        if (obj instanceof Person) {
            if (this.fname == ((Person) obj).fname
                    && this.lname == ((Person) obj).lname) {
                return true;
            }
        }
        return false;
    }
}
