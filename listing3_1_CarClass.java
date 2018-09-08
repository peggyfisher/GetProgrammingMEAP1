public class Car {        //#A
   private String make;   //#B
   private String model;  //#B
private int year;      //#B
private double mpg;    //#B
private String color;  //#B
      
   public void moveForward() {  //#C
   }
   public void moveBackward() { //#C
   }
   public void stop() {         //#C
   }
   public void turnLeft() {     //#C
   } 
   public void turnRight() {    //#C
   }
   public void honk() {         //#C
   }
   public static void main(String[] args) {  
   Car myCar = new Car();                 
      myCar.make = "Subaru";                 
      myCar.model = "Outback";                
   myCar.year = 2017;                    
   myCar.mpg = 28;                      
   myCar.color = "black";              
}
}
