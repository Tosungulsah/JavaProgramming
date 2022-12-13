package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestionNthLargestNumber {
    // write a program that can return nth largest number from an arrayList

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        list.removeIf(p-> Collections.max(list)==p);
        list.removeIf(p-> Collections.max(list)==p);

        int max= Collections.max(list);

        System.out.println(max);


    }
}
