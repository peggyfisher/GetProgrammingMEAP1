public class Vehicle implements VehicleInterface, Comparable{   //#A
    public String make;
    public String model;
    public int year;
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;} 
    public void move(int direction){   
        if(direction == 0)
            System.out.println("Turn Right");
        else if (direction == 180)
            System.out.println("Turn Left");
        else if(direction == 90)
            System.out.println("Go Straight");
        else
            System.out.println("Reverse!");
    }    
    public void brake(){
        System.out.println("STOP!!");
    }
    public void accelerate(int speed){
        System.out.println("Speed up by "+speed + " mph");
    }
    public void slowDown(int speed){
        System.out.println("Slow down by " + speed + " mph");
    }
    public int compareTo(Object o) {                          //#B
        Vehicle v = (Vehicle)o;                              //#B
        if(this.make == v.make && this.model == v.model &&        //#B
                this.year == v.year)                              //#B
            return 0;                                             //#B
        else                                                      //#B
            return 1;                                             //#B
    }
    public static void main(String[] args) {
    VehicleInterface v1 = new Vehicle();       
    v1.setMake("Chevy");
       v1.setModel("Cruze");
    v1.setYear(2018);      
    VehicleInterface v2 = new Vehicle();       
    v1.setMake("Chevy");
       v1.setModel("Cruze");
    v1.setYear(2017);      
       
       if(v1.compareTo(v2) == 0)                                //#C
           System.out.println("These vehicles are the same");   //#C
       else                                                     //#C
           System.out.println("These vehicles are different");  //#C      
    }
 }