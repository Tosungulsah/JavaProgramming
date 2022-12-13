package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractise {
    public static void main(String[] args) {
        // create an Array of Strin called countries
        // remove country if country has 10 or greater
        String[] countries= {"Japan","Korea","United States","United Kingdom","Turkey"};

        // converting array to array list
        ArrayList<String> countries2 = new ArrayList<>(Arrays.asList(countries));
        countries2.removeIf(p-> p.length()>=10);

        // converting to array again
       countries= countries2.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }
}
