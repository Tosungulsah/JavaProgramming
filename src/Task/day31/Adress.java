package Task.day31;

public class Adress {
    public int buildingNumber;
    public String street,city,postcode;

    public Adress(int buildingNumber, String street, String city, String postcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String toString() {
        return buildingNumber + " " + street + "\n" + city + ", " + postcode;
    }
}
