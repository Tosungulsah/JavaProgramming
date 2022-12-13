package day25_MethodOverLoading;

import utilities.StringUtility;
// palindrome method overloading
public class Test2 {
    public static void main(String[] args) {

        String[] words = {"Gulsah", "Ekin","Civic", "Ekni"};

        int count= 0;

        for (String each : words) {
            if(StringUtility.palindrome(each)){
                count++;
            }

        }
        System.out.println(count);
    }
}
