package lesson16_example;

public class FieldHockeyPlayer extends Athlete { 
    private String position;
    private int goalsScored = 0;

    public FieldHockeyPlayer(String fname, String lname, int age, int grade,
            double gpa, boolean active, String size, String position) {  
        super(fname, lname, age, grade, gpa, active, size);
        this.position = position;
    }

    public void setGoalsScored(int gs) {
        goalsScored = gs;
    }

    @Override
    public String toString() {   
        return super.toString() + "Position: "
                + position + "\nGoals Scored: " + goalsScored;
    }
}
