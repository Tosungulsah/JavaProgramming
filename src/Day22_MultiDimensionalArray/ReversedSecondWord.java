package Day22_MultiDimensionalArray;

public class ReversedSecondWord {
    public static void main(String[] args) {
        String sentence = " Lets start talking about Java";
        String[] words= sentence.split(" ");
        String reverse= " ";

        for (int i = words[1].length() - 1; i >= 0; i--) {
            reverse += words[1].charAt(i);

        }
        System.out.println(reverse);


    }
}
