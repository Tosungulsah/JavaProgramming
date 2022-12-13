package day26_CustomMethodPractise;

public class FrequencyOfelement {

    public static void main(String[] args) {

        int[] arr= { 4,5,4,3,3,3,77,77,8,8,};
        int n = frequencyOfElement(arr,8);
        System.out.println(n);
    }


    public static int frequencyOfElement(int[] array, int element){

        int count = 0;
        for (int each : array) {
        if(each==element) {
            count++;

        }
        }
        return count;
    }

}
