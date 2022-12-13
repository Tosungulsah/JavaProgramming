package day20_Arrays;

public class ArrayMonths2 {
    public static void main(String[] args) {
        String [] months= {"January", "February","March","April","May","June","July","August","September",
                "October","November","December"};
        for(int i=0;i < months.length;i++) {
            System.out.println(months[i]);
        }
            System.out.println("************************************************************");
            for (int j = months.length-1; j >=0; j--) {
                System.out.print(months[j]+" ");
            }
        }
    }

