package day37_Inheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone ("Iphone12","6.7 inches",1000,"Black");
        Samsung samsung= new Samsung("Galaxy","4.5 inches",1200,"Green");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println("iphone = " + iphone);
        System.out.println("samsung = " + samsung);
        System.out.println("nokia = " + nokia);

        iphone.call(2154666);
        iphone.text(4545555);
        iphone.facetime("ssss@gmail.com");
        iphone.facetime(545454654);

        System.out.println("**********************************************");
        samsung.call(3888);
        samsung.text(45454654);
        samsung.freeze();

        System.out.println("****************************************************************************");

        nokia.call(54646);
        nokia.text(5656565);
        nokia.selfDefense();

        System.out.println("***************************************************");
        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);




    }
}
