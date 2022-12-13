package ForLoopPractise;

public class FindCharacter {
    public static void main(String[] args) {
        String word= "Kemal&Ekin Gulsah";


        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);
            System.out.print(" "+ch);
        }
        System.exit(0);
    }
}
