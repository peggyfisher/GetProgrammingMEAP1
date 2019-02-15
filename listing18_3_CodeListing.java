package lesson18_example;

public class Worker {

    public String fName, lName;
    public Address address;
    public int idNumber;
    public double hoursWorked;
    public double hourlyRate;

    public String doWork() {    //#A
        return "Worker";
    }

    public Worker(String fName, String lName, Address address,
            int idNumber, double hours, double rate) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public void setHoursWorked(double hours) {
        hoursWorked = hours;
    }

    public void setHourlyRate(double rate) {
        hourlyRate = rate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {     //#B
        return fName + " " + lName + " \nCompensation: $" + calculatePay();
    }
}
