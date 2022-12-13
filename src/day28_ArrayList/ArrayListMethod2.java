package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(5); numbers.add(45); numbers.add(6); numbers.add(88);

        int givenIndex= numbers.get(2);
        System.out.println(givenIndex);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}
