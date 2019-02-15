package lesson18_example;

public class Carpenter extends Worker {

    private double lumberCosts;

    public Carpenter(String fName, String lName, Address address,
            int idNumber, double hours, double rate) {
        super(fName, lName, address, idNumber, hours, rate);
    }

    public void setLumberCosts(double amount) {
        lumberCosts = amount;
    }

    public String doWork() {
        return "Complete carpentry work";
    }

    @Override
    public String toString() {
        return "Carpenter: " + super.toString() + "\n" + doWork();
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate + lumberCosts;
    }
}
