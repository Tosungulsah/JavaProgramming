package day25_MethodOverLoading;

import java.util.Arrays;

public class AddElements_OverLoading {
    public static void main(String[] args) {

        int[] numbers= {2,4,5,6};
        numbers= addingElement(numbers,5);
        System.out.println(Arrays.toString(numbers));

        double[] decimals= { 0.2,85.0,78.4};
        decimals=addingElement(decimals,5.1);
        System.out.println(Arrays.toString(decimals));

        String[] names= {"Gulsah","Kemal","Ekin"};
        names= addingElement(names,"Ercu");
        System.out.println(Arrays.toString(names));

        char[] chars = {';','@',};
        chars = addingElement(chars,':');
        System.out.println(Arrays.toString(chars));

System.exit(0);
    }
    public static int[] addingElement(int[] num1 , int element){

        int[] result = new int[num1.length + 1];

        int i = 0;
        for (int each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    
    }

    public static double[] addingElement(double[] num1 , double element){

        double[] result = new double[num1.length + 1];

        int i = 0;
        for (double each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static char[] addingElement(char[] num1 , char element){

        char[] result = new char[num1.length + 1];

       int  i = 0;
        for (char each :num1) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

    public static String[] addingElement(String[] num1 , String element){

       String[] result = new String[num1.length + 1];

        int i = 0;
        for (String each :num1) {
            result [i++] = each;
        }
        result[i] = element;
      
        return result;

    }
    
    
}
