package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

            numbers.add(10);// index 0
            numbers.add(25); // index 1
            numbers.add(12);// index 2

        numbers.add(1,55);


        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);




System.exit(0);
    }
}
