package day37_Inheritance.PhoneTask;

public class Iphone extends Phone {
    /*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */

    public Iphone(String model, String size, double price, String colour) {
        super("apple", model, size, price, colour);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand+" "+model+ " is having a facetime with phone number"+ phoneNumber);
    }
    public void facetime(String email){
        System.out.println(brand+" "+model+ " is having a facetime with email"+ email);
    }
}
