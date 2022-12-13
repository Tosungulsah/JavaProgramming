package day29_ArrayListContinue;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(5);
        System.out.println(list);


        for (Integer each : list) {
            int frequency = 0;

            for (Integer element : list) { // for just one element of frequency
                if (element == each) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(each);
        break;
            }
        }

    }
}