package day25_MethodOverLoading;

import java.util.Arrays;

public class AddIntegerMethodTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);
        System.out.println(Arrays.toString(arr));

        double[] arr2 = {1.0, 2.0, 3.5, 4.2};
        arr2 = addDouble(arr2, 6.0);
        System.out.println(Arrays.toString(arr2));

        char[] list = {'a', 'b', 'c', 'd'};
        list = addChar(list, 'e');
        System.out.println(Arrays.toString(list));

        String[] names= {"Gulsah","Kemal","Ekin"};
        names = addString(names,"Ercu");
        System.out.println(Arrays.toString(names));
        System.exit(0);
    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addDouble(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each2 : array) {
            result[i++] = each2;

        }

        result[i] = element;
        return result;

    }

    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addString(String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each2 : array) {
            result[i++] = each2;

        }
        result[i] = element;
        return result;
    }
}