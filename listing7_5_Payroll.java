import java.util.ArrayList; 
import java.util.Scanner;

class Employee {
    private String firstName, lastName;
    private char employeeType;
    private double hourlyWage, salary, hoursWorked = 0;
    public void setFirstName(String fName) {
        firstName = fName;  }
    public String getFirstName() {
        return firstName; }
    public void setLastName(String lName) {
        lastName = lName;  }
    public String getLastName() {
        return lastName;  }
    public void setEmployeeType(char type) {           //#A
       if (type != 'h' && type != 's') {
          System.out.println("Invalid Employee Type, must be s or h");
        } else {
            employeeType = type;
        }
    }
    public char getEmployeeType() {
        return employeeType;  }
    public void setHourlyWage(double hWage) {
        hourlyWage = hWage;  }
    public double getHourlyWage() {
        return hourlyWage;  }
    public void setSalary(double salary) {
        this.salary = salary;  }
    public double getSalary() {
        return salary;  }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;  }
    public double getHoursWorked() {
        return hoursWorked;  }  
    public double calculateWeeklyEarnings() {        //#B
      if (employeeType == 'h') {
          if (hoursWorked <= 40) {
              return hoursWorked * hourlyWage;
        } else {
       return 40 * hourlyWage + ((hoursWorked - 40) * (1.5 * hourlyWage));
            }
        } else {
            return salary / 52;
        }
    }
    public String toString() {       //#C

        return "First Name: " + getFirstName()
                + "\t\tLast Name: " + getLastName()
                + //#A
                "\nHourly Rate: " + getHourlyWage()
                + //#B
                "\tTotal wages: $" + calculateWeeklyEarnings()
                + "\n";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fName, lName, response = "y", hourly = "";
        char type;
        double hrlyWage = 0, hrsWorked = 0, salary = 0;
        ArrayList<Employee> employees = new ArrayList<Employee>();//#D
        while (response.equalsIgnoreCase("y")) {
            System.out.println("Enter first name: ");
            fName = in.nextLine();
            System.out.println("Enter last name: ");
            lName = in.nextLine();
            System.out.println("Is this employee paid hourly? (y/n)");
            hourly = in.nextLine();
            if (hourly.equalsIgnoreCase("y")) {
                System.out.println("Enter hourly wage: ");
                hrlyWage = in.nextDouble();
                System.out.println("Enter hours worked: ");
                hrsWorked = in.nextDouble();
                type = 'h';
            } else {
                System.out.println("Enter yearly salary: ");
                salary = in.nextDouble();
                type = 's';
            }
            Employee tempEmployee = new Employee();
            tempEmployee.setEmployeeType(type);
            tempEmployee.setFirstName(fName);
            tempEmployee.setLastName(lName);
            if (type == 'h') {
                tempEmployee.setHourlyWage(hrlyWage);
                tempEmployee.setHoursWorked(hrsWorked);
            } else {
                tempEmployee.setSalary(salary);
            }
            in.nextLine();
            employees.add(tempEmployee);
            System.out.println("Are there more employees? (y/n)");
            response = in.nextLine();
        }
        for (Employee e : employees) {              //#E
            System.out.println(e.toString());
        }
    }
}
