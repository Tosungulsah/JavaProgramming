package day19_LoopPractises;

public class AnotherWayUniqueChar {
    public static void main(String[] args) {
        String word= "djdkjfdkjlsi";
        String result="";

        for (int i = 0; i <word.length() ; i++) {
           char ch = word.charAt(i);
            int count=0;//unique of char numbers

            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (ch == each) {
                    count++;
                }
            }
            if(count==1){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
