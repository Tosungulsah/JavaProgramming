package day20_Arrays;

import java.util.Arrays;

public class SecondWayAlphabets {
    public static void main(String[] args) {
        char[] alphabets = new char [26];

        for (int i = 0, j='Z'; i <alphabets.length ; i++,j--) {
            alphabets [i]= (char)j;
        }
        System.out.println(Arrays.toString(alphabets));
        System.exit(0);
    }
}
