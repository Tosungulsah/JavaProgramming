package day20_Arrays;

import java.util.Arrays;

public class Letters2Practise {
    public static void main(String[] args) {


        char[] letters2 = new char[26];

        char ch= 'Z';
        for (int i = 0; i<letters2.length; i++) {

            letters2[i] = ch--;

        }
        System.out.println(Arrays.toString(letters2));
    }
}
