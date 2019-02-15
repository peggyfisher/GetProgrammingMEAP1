
public class Plant {                    

    public String plantName;
    public boolean indoorPlant = true;

    public Plant(String name, boolean indoorPlant) {  
        this.plantName = name;
        this.indoorPlant = indoorPlant;
    }

    public void careForPlants() {      
        System.out.println("Parent version of careForPlants");
        System.out.println("Water the plants (" + plantName + ")");
        System.out.println("Place them in the sun");
    }

    public static void main(String[] args) {
        Plant sunflower = new OutdoorPlant("Sunflower"); 
        Plant spiderPlant = new IndoorPlant("Spider Plant");  
        OutdoorPlant daisy = new OutdoorPlant("Daisy");   
        if (daisy instanceof OutdoorPlant) 
        {
            daisy.careForPlants(30);  
        }
        sunflower.careForPlants();     
        spiderPlant.careForPlants();      
    }
}

class IndoorPlant extends Plant {    

    public IndoorPlant(String name) {
        super(name, true);          
    }
}

class OutdoorPlant extends Plant {  

    public OutdoorPlant(String name) {
        super(name, false);          
    }

    public void careForPlants(double temp) {  
        super.careForPlants();    
        if (temp < 32) {
            System.out.println("Cover plants, its cold outside");
        }
    }
}
