package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car("Mercedes","S",2012);
        Car car2= new Car("Audi", "Ss",0,0,"Black");

        Car car3= new Car("Lexus","model",2021);
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.exit(0);
    }
}
