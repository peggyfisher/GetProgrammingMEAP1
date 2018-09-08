public class Planet {

  public String planetName;  //#A
  public double milesFromEarth;  //#A
  public String description;  //#A
  public static double convertToKM(double miles) {  //#B
  return miles * 1.6;    //#B
   }  //#B
  public static void main(String[] args) {
  Planet mars = new Planet();
  mars.milesFromEarth = 138156317;  //#C
  mars.description = "The Red Planet";  //#C
  mars.planetName = "Mars";  //#C
  System.out.printf("%s is %.2f  miles from Earth and \n%.2f Kilometers from //#D   
      Earth\n" + "It is known as %s\n\n ", mars.planetName,   //#D
      mars.milesFromEarth, convertToKM(mars.milesFromEarth), mars.description); 
}//#D
}