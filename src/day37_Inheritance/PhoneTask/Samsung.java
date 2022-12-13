package day37_Inheritance.PhoneTask;

public class Samsung extends Phone {


    public Samsung(String model, String size, double price, String colour) {
        super("Samsung", model, size, price, colour);
    }

    public void freeze() {
        System.out.println(brand + " " + model + " is freezing");
    }
}
