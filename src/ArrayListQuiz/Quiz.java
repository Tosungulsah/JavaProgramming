package ArrayListQuiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Character> list= new ArrayList<>();

   for(char i= 'a'; i<= 'z';i++){
       list.add(i);
   }
      boolean result= list.containsAll(Arrays.asList('a','c','D'));
        System.out.println(result);
    }
}
