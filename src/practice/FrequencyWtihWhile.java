package practice;

public class FrequencyWtihWhile {
    public static void main(String[] args) {
        String word= "Java is fun.";
        int frequency=0;
        while(word.contains("Java")){
           word= word.replaceFirst("Java","");
           frequency++;
        }
        System.out.println(frequency);
        System.exit(0);
    }
}
