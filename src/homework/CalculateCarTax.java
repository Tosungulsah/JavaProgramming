package homework;

public class CalculateCarTax {
    public static void main(String[] args) {
        int carPrice = 62000 ;



        if(carPrice >=20000 && carPrice<=39999){
            System.out.println(carPrice * 0.2);
        }
        else if (carPrice>=40000 && carPrice<= 59999){
            System.out.println(carPrice * 0.3);
        }
        else if (carPrice>= 60000 && carPrice<=80000){
            System.out.println(carPrice * 0.4);
        }


    }


}
/*

Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4

 */