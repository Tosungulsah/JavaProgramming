package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIFMethodProperly {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        list.removeIf(p -> p<5);
        System.out.println(list);

    }
}
