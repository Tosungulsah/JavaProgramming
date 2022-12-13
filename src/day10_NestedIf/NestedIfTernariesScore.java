package day10_NestedIf;

public class NestedIfTernariesScore {
    public static void main(String[] args) {

        int score = 135;

        if (score>=0 && score <= 100){
        String result1= (score>=90)? "Excellent" :(score>=80)?"Great" :(score>=70)? "Good"
        :(score>=60)?"Passed" :"Failed";
            System.out.println(result1);
        }else{
            System.out.println("Invalid number");



}
}
}