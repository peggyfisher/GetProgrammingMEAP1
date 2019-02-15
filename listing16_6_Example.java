package lesson16_example;

public class Lesson16_Example {

    public static void main(String[] args) {
        Student s = new Student("Tish", "Maclay", 16, 11, 3.95);  
        s = new FieldHockeyPlayer("Tish", "Maclay", 16, 11, 
                3.9, true, "M", "GoalKeeper");
        s.getGPA();                                           
        System.out.println(s.toString());                     

        Athlete a = new Athlete("Tish", "Maclay", 16, 11, 3.95, true, "S"); 
        a = new FieldHockeyPlayer("Tish", "Maclay", 16, 11, 
                3.9, true, "M", "GoalKeeper");
        
        a.getGPA();                                             
        a.getEligibility();                                    
        a.getStatus();                                                     
        a.setEligibility();                                     
        a.setStatus(true);           
        
        System.out.println(a.toString());                       
    }
}
