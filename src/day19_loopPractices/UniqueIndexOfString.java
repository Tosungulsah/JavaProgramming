package day19_loopPractices;

public class UniqueIndexOfString {
    public static void main(String[] args) {

        String word= "hesjfskfkskkd";
        String result= "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); // each character of string

            if(word.indexOf(ch)==word.lastIndexOf(ch)){ // first and last char are same, char is unique
                result += ch;
            }
        }
        System.out.println(result);

    }
}
