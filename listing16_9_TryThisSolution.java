
public class Lesson16_Examples {

    public static void main(String[] args) {
        Electronics e = new CellPhone("Samsung", "9 Plus", "Smart Phone");  
        CellPhone cell = new CellPhone("LG", "3", "Flip phone");
        e.print();  
        cell.print();  
        System.out.println(cell.style);   
    }
}

class Electronics {

    public String make, model;

    public Electronics(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void print() {
        System.out.println("I'm an electronics object");
    }
}

class CellPhone extends Electronics {

    public String style;

    public CellPhone(String make, String model, String style) {
        super(make, model);
        this.style = style;
    }

    public void print() {
        System.out.println("I'm a cellphone object");
    }
}

