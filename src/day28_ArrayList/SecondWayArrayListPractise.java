package day28_ArrayList;

import java.util.ArrayList;

public class SecondWayArrayListPractise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(3);numbers.add(4);numbers.add(5);numbers.add(6);
        System.out.println(numbers);
        // change like that >> 2,4,6,8,10,12

        for (int i = 0; i < numbers.size(); i++) {
           numbers.set(i, numbers.get(i)*2);

        }
        System.out.println(numbers);

    }
}
