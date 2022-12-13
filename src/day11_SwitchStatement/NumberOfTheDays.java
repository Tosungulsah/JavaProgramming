package day11_SwitchStatement;

public class NumberOfTheDays {
    public static void main(String[] args) {


    /*
    28 days 2
    30 days 4 6 9 11
    31 days 1 3 5 7 10 12
     */
        int year = 2000;
        int number = 2;
        String result = "";

        if(number>=1 && number <=12 ) {
            switch (number) {
                case 2:
                    if(year%4==0) {
                        result = "29 Days";
                    }
                    else {
                        result= "28 Days";
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 Days";
                    break;
                default:
                    result="31 Days";
                    break;

            }
        }else {
            result= "Invalid Number";
        }

        System.out.println(result);

    }


}
