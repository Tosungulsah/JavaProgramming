package day12_Scanner;

import java.util.Scanner;

public class ScannerWeekDay {
    public static void main(String[] args) {


        Scanner days= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = days.nextInt();
        String result="";

       if(num>=1 && num<=7){
       result = (num==1)?"Monday" :(num==2)? "Tuesday" :(num==3)? "Wednesday" :(num==4)?"Thursday"
        :(num==5)?"Friday" :(num==6)?"Saturday" :"Sunday";

        }       else {
       result="Invalid Number";
          }

        System.out.println(result);
        days.close();


}
}