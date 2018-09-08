import java.util.ArrayList;
public class Planets {
    private static final ArrayList<String> planets = new ArrayList<String>(); //#A
    public static void addPlanets() {
        planets.add("Earth");  //#B
        planets.add("Mars");  //#B
        planets.add("Uranus");  //#B
        planets.add("Venus");  //#B
        planets.add("Mercury");  //#B
        planets.add("Jupiter");  //#B
        planets.add("Saturn");  //#B
        planets.add("Neptune");  //#B
    }
    public static void main(String[] args) {
        addPlanets();  //#C
        System.out.println(planets);  //#D
        ArrayList dwarfPlanets = new ArrayList<String>();
        dwarfPlanets.add("Pluto");
        planets = dwarfPlanets; 
    }
}