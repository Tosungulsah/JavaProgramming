package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovingZero2 {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
