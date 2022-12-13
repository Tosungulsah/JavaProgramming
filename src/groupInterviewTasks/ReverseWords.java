package groupInterviewTasks;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverse("Today is sunny"));
    }
    public static String reverse(String x) {
        String[] reversedwords = x.split(" ");
        String reversedwordsstring =  "";
        String space = " ";
        for (int i = reversedwords.length-1; i>=0; i--) {
            reversedwordsstring += reversedwords[i] + space;
        }

        return reversedwordsstring.trim();

    }

    }
