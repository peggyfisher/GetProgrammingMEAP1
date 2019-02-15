
public class Computer {

    String brand, monitor, keyboard, mouse;

    public Computer() {                  
        brand = "Microsoft Surface";
    }

    public Computer(String brand) {      
        this.brand = brand;
    }

    public Computer(String brand, String monitor, String keyboard, 
            String mouse) {
        this.brand = brand;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        Computer laptop1 = new Computer();  
        System.out.println(laptop1.brand);
        Computer laptop2 = new Computer("Macbook Pro");  
        System.out.println(laptop2.brand);
        Computer desktop = new Computer("Dell XPS", "Samsung Monitor", 
                "Logitech Keyboard", "Ergonomic Mouse");
        System.out.println(desktop.brand + ", " + desktop.monitor + ", "
                + desktop.keyboard + ", " + desktop.mouse);
    }
}
