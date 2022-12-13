package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMEthod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2 !=0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
