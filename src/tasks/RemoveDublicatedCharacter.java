package tasks;

public class RemoveDublicatedCharacter {
    public static void main(String[] args) {
        String str = "aabbaacc";

        String result = "";
        for (int i = 0; i <= str.length()-1; i++) { // represent all the string nnumbers of string
            String ch =""+ str.charAt(i);// represent each character of thestring

            if (!result.contains(ch)) { // if the character is not contained in the result
                result += ch; // the char. will be added the result
            }
        }
        System.out.println("result = " + result);

    }
}
