package groupInterviewTasks;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println( reverse("Gulsah"));
    }

    public static String reverse(String x) {
        String a = "";
        for (int i = x.length()-1; i >= 0; i--) {
            a += x.charAt(i);
        }
        return a;
    }

}