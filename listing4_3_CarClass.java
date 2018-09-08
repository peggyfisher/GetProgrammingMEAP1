public class Car {        
private String make, model, color;   
private int year;      
private double mpg;   

      //#A
public static void main(String[] args) {  
   Car myCar = new Car();                 
   myCar.make = "Subaru";                 
   myCar.model = "Outback";                
   myCar.year = 2017;                    
   myCar.mpg = 28;                      
   myCar.color = "black";   

   System.out.println("My car: ");
   System.out.println(myCar.getMake());   //#B
   System.out.println(myCar.getModel());
   System.out.println(myCar.getYear());
   System.out.println(myCar.getMPG());
   System.out.println(myCar.getColor());  //#B
        
   myCar.setMake("Ford");                  //#C
   myCar.setModel("Mustang");
   myCar.setYear(2018);
   myCar.setMPG(55.7);
   myCar.setColor("Red");                  //#C
        
   System.out.println("My car: ");
   System.out.println(myCar.getMake());   //#D
   System.out.println(myCar.getModel());
   System.out.println(myCar.getYear());
   System.out.println(myCar.getMPG());
   System.out.println(myCar.getColor());  //#D

   myCar.setYear(2075);                   //#E
  }
}
