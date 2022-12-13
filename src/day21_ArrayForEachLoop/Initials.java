package day21_ArrayForEachLoop;
//first letter and last letter
public class Initials {
    public static void main(String[] args) {
        String[] classmates = {"Gulsah","Kemal","Ekin","Ercu"};

        for (String each : classmates){
            String initial =""+ each.charAt(0)+each.charAt(each.length()-1);
            System.out.println(initial);
        }
        System.exit(0);
    }
}
