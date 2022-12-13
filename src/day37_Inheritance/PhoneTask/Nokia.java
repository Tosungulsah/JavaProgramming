package day37_Inheritance.PhoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String colour) {
        super("Nokia", model, size, price, colour);
    }

    public void selfDefense(){
        System.out.println("You can use "+ brand+" "+model+ "as self defense tool");
    }
}
