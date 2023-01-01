package day43_Abstraction.car;

public class Audi extends Car{

    public Audi(String model, String colour, int year, double price) {
        super("Audi", model, colour, year, price);
    }

    @Override
    public void start() {
        System.out.println("Pressing the start button");
    }


}
