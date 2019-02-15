public class Address {

    public void print(String fName, String lName, String address1,
            String city, String state, String zip) {
        System.out.println(fName + lName + "\n" + address1 + "\n"
                + city + ", " + state + "  " + zip);
    }

    public void print(String address2, String city, String state, String zip) {
        System.out.println("Current Resident\n" + "\n" + address2
                + "\n" + city + ", " + state + "  " + zip);
    }
}
