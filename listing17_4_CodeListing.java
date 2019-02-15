package lesson17_examples;

public class Lesson17_Examples {

    public static void main(String[] args) {
        Person p1 = new Person("Hannah", "Wise", 26);
        Person p2 = new Person("Courtney", "Johnson", 31);
        if (p1.compareTo(p2) < 0) {        
            System.out.println(p1.toString() + p2.toString());
        } else {
            System.out.println(p2.toString() + p1.toString());
        }
    }
}

class Person implements Comparable {     

    private String fname, lname;
    private int age;

    public Person(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {    
        if (obj instanceof Person) {
            if (this.lname.compareToIgnoreCase(((Person) obj).lname) < 0) {    
                return -1;
            } else if (this.lname.compareToIgnoreCase(((Person) obj).lname) == 0) {
                return 0;
            } else {             
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return lname + ", " + fname + "\n";
    }
}
