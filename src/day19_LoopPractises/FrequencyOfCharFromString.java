package day19_LoopPractises;

public class FrequencyOfCharFromString {
/* aabccdeef
    output: bdf
    */

    public static void main(String[] args) {

        String word= "aabccdeef";


        for (int i = 2; i < word.length(); i +=3) {
            char ch= word.charAt(i);

            System.out.print(ch);
        }


        System.exit(0);


    }

}
