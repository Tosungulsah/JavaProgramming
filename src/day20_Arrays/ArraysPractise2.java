package day20_Arrays;

import java.util.Arrays;

public class ArraysPractise2 {
    public static void main(String[] args) {
        char[] letters = new char[26];
       // letters[0]='A'; // instead of this we can create loop
        for (int i = 0, j= 'A'; i < letters.length  ; i++,j++) {// i = index numver 0- last index
            letters[i]= (char)j;

        }
        System.out.println(Arrays.toString(letters));
    }
}
