public class Vehicle implements VehicleInterface{  //#A
    public void move(int direction){         //#B
        if(direction == 0)
            System.out.println("Turn Right");
        else if (direction == 180)
            System.out.println("Turn Left");
        else if(direction == 90)
            System.out.println("Go Straight");
        else
            System.out.println("Reverse!");
    }
    public void brake(){                       //#B
        System.out.println("STOP!!");
    }
    public void accelerate(int speed){         //#B
        System.out.println("Speed up by "+speed + " mph");
    }
    public void slowDown(int speed){             //#B
        System.out.println("Slow down by " + speed + " mph");
    }
    public static void main(String[] args) {
        VehicleInterface v1 = new Vehicle();               //#C
        v1.accelerate(10);                        //#D
        v1.move(90);                 //#D
        v1.slowDown(5);                           //#D
        v1.move(0);                  //#D
        v1.brake();                               //#D
    }
}