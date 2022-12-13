package groupInterviewTasks;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(ispalindrome("anna"));
    }

    public static boolean ispalindrome(String word){
        String reversed = "";

        for (int i = word.length()-1; i>=0; i--) {
            reversed += word.charAt(i);
        }
        if (reversed.equals(word)){
            return true;
        }
        else {
            return false;
        }


    }
}
