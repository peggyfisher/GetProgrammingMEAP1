class Employee {     
private String firstName, lastName;   
private char employeeType;            
private double hourlyWage, salary, hoursWorked = 0;  

// Getter and Setter methods are omitted, see code above   
 
   public double calculateWeeklyEarnings() {
   if(employeeType == 'h') {
      if(hoursWorked <= 40)
          return hoursWorked * hourlyWage;
      else
          return 40 * hourlyWage + 
             ((hoursWorked - 40) * (1.5 * hourlyWage));
       } 
   else     //this is a salaried employee
         return salary/52;
   ) 
   public String toString() {
      return "First Name: " + getFirstName() + 
        "\t\tLast Name: " + getLastName() +                //#A
        "\nHourly Rate: " + getHourlyWage() +              //#B
        "\tTotal wages: $" + calculateWeeklyEarnings() + 
        "\n";
           "Total wages: $" + getTotalWages();
   }