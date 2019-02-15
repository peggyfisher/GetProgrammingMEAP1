package lesson18_example;

public class Address {

    private String street1, street2, city, state;
    private String zip;

    public Address(String street1, String city, String state,
            String zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(String street1, String street2, String city, String state, 
            String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public String toString() {                        
        if (street2 == null) {
            return street1 + "\n"
                    + city + ", " + state + "  " + zip;
        } else {
            return street1 + "\n" + street2 + "\n"
                    + city + ", " + state + "  " + zip;
        }
    }
}
