public class Car {        
   private String make, model, color;   
private int year;      
private double mpg;   

public String getMake() { return make; }    
public String getModel() { return model; }  
public String getColor() { return color; }  
public int getYear() { return year; }       
public double getMPG() {return mpg; }      

public void setMake(String make) { 
   if(make.length() >= 3 && make.length() < 50)  //#A      
      this.make = make;  
   else 
      System.out.println("Invalid make");}      
public void setModel(String model) {        
   if(model.length() > 4 && model.length() < 100)  //#B      
      this.model = model;  
   else 
      System.out.println("Invalid model");}      
public void setColor (String color) {       
   if(color.length() > 4 && color.length() < 40)  //#C      
      this.color = color;  
   else 
      System.out.println("Invalid color");}      
public void setYear (int year) {            
   if(year >= 1900 && year <=2050)
      this.year = year;
   else 
      System.out.println("Invalid year");
   }
public void setMPG(double mpg) {            
   if(mpg >= 0 && mpg < 100)  //#D      
      this.mpg = mpg;  
   else 
      System.out.println("Invalid mpg");}      

// remaining code omitted
