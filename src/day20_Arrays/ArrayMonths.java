package day20_Arrays;

import java.util.Arrays;

public class ArrayMonths {
    public static void main(String[] args) {
        String[] months = {"January", "February","March","April","May","June","July","August","September",
        "October","November","December"};
        System.out.println(Arrays.toString(months));
        int monthNo = 5;

        if(monthNo<1||monthNo>12){
            System.err.println("Invalid");
            System.exit(0);
        }
        System.out.println(months[monthNo-1]);
    }
}
