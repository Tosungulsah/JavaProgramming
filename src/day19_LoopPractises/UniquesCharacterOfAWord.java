package day19_LoopPractises;

public class UniquesCharacterOfAWord {
    public static void main(String[] args) {

        String word = "aabccdeef";
        String result="";

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            if(word.indexOf(ch)==word.lastIndexOf(ch)){
                result += ch;
            }
        }

        System.out.println(result);
    }
}
