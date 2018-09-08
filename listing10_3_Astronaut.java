public class Astronaut {
    private static String companyName = "NASA";         //#A
    private String fName, lName;
    private int id;
    private static int nextIDNumber = 1;
    public String getName() {return fName + " " + lName;}  
    public void print() {System.out.println("Astronaut: " + fName + " " + 
            lName);}      
    public static void main(String[] args) {
       Astronaut astro1 = new Astronaut();
       astro1.fName = "Howard";
       astro1.lName = "Wolowitz";
       astro1.id = nextIDNumber;
       nextIDNumber++;
       Astronaut astro2 = new Astronaut();
       astro2.fName = "John";
       astro2.lName = "Glenn";
       astro2.id = nextIDNumber;
       nextIDNumber++;
       System.out.println(companyName + "\n===================");   //#B
       astro1.print();
       astro2.print();    
    }   
}