package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str= "aaaabbaabbcdde";
        str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); // convert the string to arraylist
        System.out.println(list);

    }
}
