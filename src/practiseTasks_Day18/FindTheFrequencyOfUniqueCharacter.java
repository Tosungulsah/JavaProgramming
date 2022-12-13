package practiseTasks_Day18;

public class FindTheFrequencyOfUniqueCharacter {
    public static void main(String[] args) {

        String word = "aabcccd";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);// each char from string
            int count = 0;
            for (int j = 0; j < word.length(); j++) { // to find the frequency of each character
                char each = word.charAt(j);
                if (ch == each) {
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result += count;
        }
        System.out.println(result);
        System.exit(0);
    }
}
