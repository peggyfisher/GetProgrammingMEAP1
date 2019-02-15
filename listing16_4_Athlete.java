package lesson16_example;

public class Athlete extends Student { 

    private boolean active = true, eligible = true;
    private String size;

    public Athlete(String fname, String lname, int age, int grade, double gpa,
            boolean active, String size) {
        super(fname, lname, age, grade, gpa);  
        this.active = active;
        this.size = size;
    }

    public void setEligibility() {
        if (this.getGPA() < 2.0) {
            eligible = false;
        }
    }

    public void setStatus(boolean status) {
        active = status;
    }

    public boolean getStatus() {
        return active;
    }

    public boolean getEligibility() {
        return eligible;
    }

    @Override
    public String toString() {              
        return super.toString() + "Active: " + active + "\nEligible: "
                + eligible + "\nUniform Size: " + size + "\n";
    }
}
