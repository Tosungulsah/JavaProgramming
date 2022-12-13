package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("*************************************************");

        ArrayList<Character> list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D'));
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("********************************************************");

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        System.out.println(list3);
        Collections.swap(list3,0,6);
        System.out.println("list3 swapped = " + list3);

        int max= Collections.max(list3);
        int min= Collections.min(list3);
        System.out.println("min = " + min);


        System.out.println("************************************");
        ArrayList<Integer> list4= new ArrayList<>();

        list4.addAll(Arrays.asList(10,20,30,40,50,60,10,10,20,30));
        Collections.replaceAll(list4,10,100);


      int frequency=  Collections.frequency(list4,100);
        System.out.println("frequency = " + frequency);


    }
}
