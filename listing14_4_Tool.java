
public class Tool {

    public String toolName;
    public boolean isManual;

    public Tool(String toolName, boolean isManual) {
        this.toolName = toolName;
        this.isManual = isManual;
    }

    public void start() {
        System.out.println("Start the tool");
    }

    public static void main(String[] args) {
        Tool tool = new Tool("Rake", true);
        Tool mower = new Mower("Mower", false, "Lawnboy");
        Mower reelMower = new Mower("Reel Mower", true, "Fiskars");
    }
}

class Mower extends Tool {

    String brand;

    public Mower(String toolName, boolean isManual, String brand) {
        super(toolName, isManual);
        this.brand = brand;
    }

    public void start() {
        if (isManual) {
            System.out.println("Start pushing");
        } else {
            System.out.println("Move switch to Choke, pull on cord to start");
        }
    }
}
