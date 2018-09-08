public class Pet {			//#A
    private String petName;        //#B
    private String petType;        //#B
    private String owner;          //#B
    private int petAge;            //#B
    
public static void main(String[] args) {    
    Pet p1 = new Pet();                     
    p1.petName = "Harley";         //#C 
    p1.petType = "dog";                     
    p1.owner = "Cy Fisher",                 
    p1.petAge = 4;                          
    
    Pet p2 = new Pet();                    
    p2.petName = "Harley";
    p2.petType = "dog";
    p2.owner = "Cy Fisher",
    p2.petAge = 4;
    
    Pet p3 = new Pet();                     
    p3.petName = "Harley";
    p3.petType = "dog";
    p3.owner = "Cy Fisher",
    p3.petAge = 4;

    }
}
