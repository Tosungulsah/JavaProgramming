package practice;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "shdjshskhdksdhsk";
        String result="";

        char ch='s';
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
           if(ch==each) {
               count++;
           }
        }
        System.out.println(count);
        System.exit(0);
    }
}
