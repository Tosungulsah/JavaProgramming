package day32_Constructor;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1= new Carpet(120,50,1000,true);
        System.out.println(carpet1);

        System.out.println(carpet1.calcCost());
        Carpet carpet2= new Carpet(120,50,100,false);
        System.out.println(carpet2);
        System.exit(0);
    }
}
