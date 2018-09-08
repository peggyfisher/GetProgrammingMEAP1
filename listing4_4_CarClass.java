import java.util.Scanner;     //#A
public class Car {        
   private String make, model, color;   
private int year;      
private double mpg;   

// getter and setter methods are omitted in this printed version

   public void moveForward() { }   
   public void moveBackward() { }
   public void stop() { }
   public void turnLeft() { } 
   public void turnRight() { }
   public void honk() { }

   public double calculateDistance(double fuel) {   //#B
      double distance = fuel * mpg;                 //#C     
      return distance;                              //#D
   }
   public static void main(String[] args) { 
      Scanner in = new Scanner(System.in);          //#E
   Car myCar = new Car();                 
      myCar.make = "Subaru";                 
      myCar.model = "Outback";                
   myCar.year = 2017;                    
   myCar.mpg = 28;                      
   myCar.color = "black";   

   System.out.println("Enter fuel remaining in tank: ");
   double fuelInTank = in.nextDouble();                //#F
   double distance = myCar.calculateDistance(fuelInTank);    //#G
   System.out.println("The car can travel " + distance + "miles"); //#H
              
}
}
