class Employee {     
private String firstName, lastName;                  //#A
private char employeeType;                           //#A
private double hourlyWage, salary, hoursWorked = 0;  //#A
   public void setFirstName(String fName) {             //#B
      firstName = fName; }                              //#B
   public String getFirstName() {                       //#B
      return firstName; }                               //#B
   public void setLastName(String lName) {              //#B
      lastName = lName; }                              //#B
   public String getLastName() {                       //#B
      return lastName; }                                 //#B
   public void setEmployeeType(char type) {             //#B  
      if(type != 'h' && type != 's')                    
         System.out.println("Invalid Employee Type, must be s or h");  
      else                                               //#B       
         employeeType = type; }      //#B
   public char getEmployeeType() {     //#B
      return employeeType; }          //#B
   public void setHourlyWage(double hWage)  {      //#B
      hourlyWage = hWage; }             //#B
   public double getHourlyWage() {       //#B
      return hourlyWage; }                  //#B
   public void setSalary(double salary) {      //#B
      this.salary = salary; }                    //#B
   public double getSalary () {                    //#B
      return salary; }
   public void setHoursWorked (double hoursWorked) { 
      this.hoursWorked = hoursWorked; }          //B
   public double getHoursWorked () { 
      return hoursWorked; }
}