package day21_ArrayForEachLoop;

public class ReverseOfEach {
    public static void main(String[] args) {
        String[] classmates = {"Gulsah","Kemal","Ekin","Ercu"};

        for (String each : classmates) {
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
             reverse += each.charAt(i);

            }
            System.out.println(reverse.toLowerCase());
        }
System.exit(0);
    }
}
