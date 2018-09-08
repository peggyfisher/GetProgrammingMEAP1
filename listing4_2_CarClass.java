public class Car {        
   private String make, model, color;   
private int year;      
private double mpg;   

public String getMake() { return make; }    //#A
public String getModel() { return model; }  //#A
public String getColor() { return color; }  //#A
public int getYear() { return year; }       //#A
public double getMPG() {return mpg; }       //#A

public void setMake(String make) {          //#B
   this.make = make;  }      
public void setModel(String model) {        //#B
   this.model = model; }
public void setColor (String color) {       //#B
   this.color = color; }
public void setYear (int year) {            
   if(year >= 1900 && year <=2050)
      this.year = year;
   else 
      System.out.println("Invalid year");
   }
public void setMPG(double mpg) {             //#B
   this.mpg = mpg; }          //#B
      
   public void moveForward() { }   
   public void moveBackward() { }
   public void stop() { }
   public void turnLeft() { } 
   public void turnRight() { }
   public void honk() { }
   public static void main(String[] args) {  
   Car myCar = new Car();                 
      myCar.make = "Subaru";                 
      myCar.model = "Outback";                
   myCar.year = 2017;                    
   myCar.mpg = 28;                      
   myCar.color = "black";              
}
}
