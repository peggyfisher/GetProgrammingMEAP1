public class Car {
… //#A
}
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   … //#B

   ArrayList<Car> usedCars = new ArrayList<Car>();   //#C
   usedCars.add(oldCar1);   //#D
   usedCars.add(oldCar2);   //#D
   usedCars.add(oldCar3);   //#D

   System.out.println("These are the cars on the lot: ");
   System.out.println(usedCars);                             //#E    
   System.out.println("There are " + usedCars.size() +       //#F       
           " used cars on the lot");
   usedCars.remove(0);                                       //#G
   System.out.println("\nThese are the cars on the " + 
         "lot after removing the first element in the list: ");
   System.out.println(usedCars);                             //#E
   System.out.println("There are " + usedCars.size() +       //#F
         " used cars on the lot");
 }