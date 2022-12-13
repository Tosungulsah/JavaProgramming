package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable thats cApable enough to contain 5 names
        String[] myGroup = new String[6]; //
        //System.out.println(myGroup); // you cant print out with this
        System.out.println(Arrays.toString(myGroup) ); // we have to call java.util.arrays

        int[] exp2 = new int[5];
        System.out.println(Arrays.toString(exp2));
    }
}
