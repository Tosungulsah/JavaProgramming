package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
      //  Car car1= new Car("Cydeo","Batch10","Blue","1987",200010)
        Honda honda= new Honda("Accord","Black",2019,12000);

        Audi audi= new Audi("Q7","Blue",2020,15000);

        Tesla tesla = new Tesla("Model3","Red",2021,25000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("**************************************************************");
        honda.setColour("Pink");
        audi.setColour("Green");
        tesla.setColour("White");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
