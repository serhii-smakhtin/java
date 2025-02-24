package StreamAPIHW;

public class Address {
    String city;
    String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }
}
