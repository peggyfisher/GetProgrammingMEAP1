package lesson16_example;

public class SportsTeam {

    private String sportType, teamName;
    private Athlete[] teamMembers = new Athlete[20];
    private int count = 0;

    public SportsTeam(String sportType, String teamName) {
        this.sportType = sportType;
        this.teamName = teamName;
    }

    public void addAthletes(Athlete[] athletes) {
        for (Athlete a : athletes) {
            if (!(a == null)) {     
                a.setEligibility();  
                if (a.getStatus() && a.getEligibility()) {   
                    teamMembers[count] = a;
                    count++;
                }
            }
        }
    }

    @Override
    public String toString() {    
        String names = "";
        for (Athlete a : teamMembers) {
            if (!(a == null)) {
                names += a.toString() + "\n";  
            }
        }
        return sportType + " " + teamName + "\n" + names;
    }
}
