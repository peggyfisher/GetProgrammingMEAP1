public class Car {        
   private String make, model, color;   //#A
private int year;      
private double mpg;    
      
   public void moveForward() {  
   }
   public void moveBackward() { 
   }
   public void stop() {         
   }
   public void turnLeft() {     
   } 
   public void turnRight() {    
   }
   public void honk() {         
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
