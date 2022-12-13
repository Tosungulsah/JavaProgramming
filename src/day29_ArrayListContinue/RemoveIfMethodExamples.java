package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each-> each%2==0);
        System.out.println(list2);
    }
}
