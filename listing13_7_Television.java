
public class Television {

    boolean hasEthernet, hasWiFi;
    String brand;
    double screenSize;

    public Television() {   
        hasEthernet = false;
        hasWiFi = false;
        brand = "Samsung";
        screenSize = 19;
    }

    public Television(boolean hasEthernet, boolean hasWiFi, String brand,
            double screenSize) {    
        this.hasEthernet = hasEthernet;
        this.hasWiFi = hasWiFi;
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public void print() {
        if (hasEthernet || hasWiFi) {
            System.out.println("This IS a smart tv: ");
        } else {
            System.out.println("This is not a smart tv: ");
        }
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize + " inches");
    }

    public static void main(String[] args) {
        Television tv = new Television();   
        Television smartTV = new Television(false, true, "Samsung", 50.5);
        tv.print();   
        smartTV.print();
    }
}
