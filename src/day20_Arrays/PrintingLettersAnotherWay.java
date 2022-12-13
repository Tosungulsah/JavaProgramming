package day20_Arrays;

public class PrintingLettersAnotherWay {
    public static void main(String[] args) {
        char[] letters= new char[26];

        char ch= 'A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i] = ch;
        }
        System.exit(0);
}
}
