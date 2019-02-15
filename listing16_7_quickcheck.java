
public class Lesson16_Example {

    public static void main(String[] args) {
        Student fp1 = new SoccerPlayer("Gita", "Chandra", 16, 11,
                3.5, true, "XL", "Fullback");
        Student tp1 = new TennisPlayer("Troy", "Miles", 17, 11, 1.95,
                true, "L", true);
        Student fh2 = new FieldHockeyPlayer("Cindy", "Bierly", 15, 10,
                3.5, true, "S", "Midfield");
        Student s1 = new Student("Marchela", "Bozhilova", 14, 9, 3.95);
        
        Student[] students = new Student[50];
        
        students[0] = fp1;
        students[1] = fp1;
        students[2] = tp1;
        students[3] = fh2;
        students[4] = s1;
        
        TennisPlayer[] tplayers[10];
        int count = 0;
        for (Student s : students) {
            if (s instanceof FieldHockeyPlayer) {
                tplayers[count] = (FieldHockeyPlayer) s;
                count++;
            }
        }
        SportsTeam tennisTeam = new SportsTeam("Tennis", "Huskies");
        tennisTeam.addAthletes(tplayers);
        System.out.println(tennisTeam.toString());
    }
}
