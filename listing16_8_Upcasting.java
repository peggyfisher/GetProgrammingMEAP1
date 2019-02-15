
public class Lesson16_Example {

    public static void main(String[] args) {
        int fhCount = 0;
        Student fh1 = new FieldHockeyPlayer("Tish", "Maclay", 16, 11,
                3.9, true, "M", "GoalKeeper");
        Student fp1 = new FootballPlayer("Darryl", "McKnight", 17, 12,
                1.5, true, "XL", "Quarterback");
        Student tp1 = new TennisPlayer("Abhiram", "Nirman", 17, 11, 4.0,
                true, "L", true);  //#A
        Student fh2 = new FieldHockeyPlayer("Bethan", "Palmer", 15, 10,
                3.5, true, "S", "Midfield");

        fh2.setGoalsScored(5);

        Student s1 = new Student("Zahraa", "Khalil", 14, 9, 3.95);
        
        FieldHockeyPlayer[] fhPlayers = new FieldHockeyPlayer[10];
        
        Student[] students = new Student[5];
        
        students[0] = fh1;   
        students[1] = fp1;
        students[2] = tp1;
        students[3] = fh2;
        students[4] = s1;
        
        for (Student s : students) {
            if (s instanceof FieldHockeyPlayer) {
                fhPlayers[fhCount] = (FieldHockeyPlayer) s;  
                fhCount++;
            }
        }
        
        SportsTeam fhTeam = new SportsTeam("Field Hockey", "Huskies");
        fhTeam.addAthletes(fhPlayers);
        System.out.println(fhTeam.toString());
    }
}
