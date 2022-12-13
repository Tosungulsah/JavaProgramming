package day10_NestedIf;

public class NestedifBuyingAlcohol {
    public static void main(String[] args) {
        int age = 19;

        boolean hasId= false ;

        if (hasId){

            if(age >=21){
                System.out.println("Eligible to buy alcohol.");
            }
            else{
                System.out.println("Not eligible to buy alcohol.");
            }
        }else{
            System.out.println("You must bring your ID.");
        }

    }
}
