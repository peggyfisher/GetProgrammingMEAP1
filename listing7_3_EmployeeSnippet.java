//code omitted
protected double calculateEarnings() {
double weeklyEarnings;
if (employeeType == 'h') {                //#A
   if (hoursWorked <= 40) {
      weeklyEarnings = hoursWorked * hourlyWage;
   } else {
      weeklyEarnings = 40 * hourlyWage + ((hoursWorked - 40)
          * hourlyWage * 1.5);
   }
} else {             //#B
weeklyEarnings = salary / 52;
}
return weeklyEarnings;
}