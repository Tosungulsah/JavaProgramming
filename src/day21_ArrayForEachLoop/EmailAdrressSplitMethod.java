package day21_ArrayForEachLoop;

import java.util.Arrays;

public class EmailAdrressSplitMethod {
    public static void main(String[] args) {
        String email = "Gulsahustatosuntosun@gmail.com";

        String[] name= email.split("@");
        System.out.println(Arrays.toString(name));
        System.exit(0);
    }
}
