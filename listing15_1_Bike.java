
public class Lesson15_TryThisSolution {

    public static void main(String[] args) {
        Bike b = new MountainBike("Mountain Bike", "REI", "Diamondback", 
                10, 20, 27.5);
        b.print(); 
    }
}

class Bike {

    public String type, make, model;
    public int gear;
    public int speed;

    public Bike(String type, String make, String model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public Bike(String type, String make, String model, int gear, int speed) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.gear = gear;
        this.speed = speed;
    }

    public void print() {
        System.out.println("Bike info: " + type + ", " + make + ", "
                + model);
    }
}

class MountainBike extends Bike {

    public double seatHeight;

    public MountainBike(String type, String make, String model, int gear,
            int speed, double seatHeight) {
        super(type, make, model, gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override   
    public void print() {
        System.out.println("Mountain Bike info: " + type + ", " + make + ", "
                + model + ", seat height: " + seatHeight);
    }
}
