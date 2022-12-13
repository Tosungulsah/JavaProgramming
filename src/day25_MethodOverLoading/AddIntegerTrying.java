package day25_MethodOverLoading;

public class AddIntegerTrying {
    public static void main(String[] args) {

        System.exit(0);
    }
    public static int[] arrayNumbers(int[] list1,int element){
        int[] result= new int[list1.length+1];
        int i=0;
        for (int each : list1) {
            result[i++]= each;
        }
            result[result.length-1]=element;
        return result;


    }
}
