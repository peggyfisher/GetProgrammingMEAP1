
public class Address {

    public void print(String fName, String lName, String address1,
            String city, String state, String zip) {
        System.out.println(fName + lName + "\n" + address1 + "\n"
                + city + ", " + state + "  " + zip);
    }

    public void print(String address1, String city, String state, String zip) {
        System.out.println("Current Resident\n" + address1
                + "\n" + city + ", " + state + " " + zip + "\n");

    }

    public void print(String fName, String lName, int POBox, 
            String city, String state, String zip) {
        System.out.println(fName + lName + "\nPO Box " + POBox + "\n"
                + "\n" + city + ", " + state + "  " + zip);
    }

    public static void main(String[] args) {
        Address address1 = new Address();    
        address1.print("123 First Street", "Carpinteria", "CA", "23901"); 
        address1.print("Peggy", "Fisher", "123 Main Street", "Ambler", 
                "PA", "19001");
        address1.print("Tish", "Macclay", 756, "Scituate", "MA", "02566"); 
    }

}
