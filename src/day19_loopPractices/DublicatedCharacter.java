package day19_loopPractices;

public class DublicatedCharacter {
    public static void main(String[] args) {

        String word= "wwwcydeocom";
        String result="";

        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            int count=0; // that variable will count how many char i have in the string
            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if(ch==each) {
                    count++;
                }
            }
            if(count ==1){
                continue;
            }
            result+=ch;
    }
        System.out.println(result);
    }



}
