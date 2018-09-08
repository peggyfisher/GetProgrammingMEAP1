class Car {
   String make;
   String model;
int year;
double mpg;
String color;
      
   void moveForward() {
   }
   void moveBackward() {
   }
   void stop() {
   }
   void turnLeft() {
   }
   void turnRight() {
   }
   void honk() {
   }
   public static void main(String[] args) {  //#A
   Car myCar = new Car();                 //#B
      myCar.make = "Subaru";                  //#C
      myCar.model = "Outback";                //#C
   myCar.year = 2017;                     //#C
   myCar.mpg = 28;                      //#C
   myCar.color = "black";              //#C
}
}
