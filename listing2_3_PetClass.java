class Pet {			//#A
    String petName;        //#B
    String petType;        //#B
    String owner;          //#B
    int petAge;            //#B
    
public static void main(String[] args) {    //#C
    Pet p1 = new Pet();                     //#D
    p1.petName = "Harley";                  //#E
    p1.petType = "dog";                     //#E
    p1.owner = "Cy Fisher",                 //#E
    p1.petAge = 4;                          //#E
    
    Pet p2 = new Pet();                     //#D
    p2.petName = "Harley";
    p2.petType = "dog";
    p2.owner = "Cy Fisher",
    p2.petAge = 4;
    
    Pet p3 = new Pet();                     //#D
    p3.petName = "Harley";
    p3.petType = "dog";
    p3.owner = "Cy Fisher",
    p3.petAge = 4;

    }
}
