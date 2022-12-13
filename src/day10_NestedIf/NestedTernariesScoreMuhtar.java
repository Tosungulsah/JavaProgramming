package day10_NestedIf;

public class NestedTernariesScoreMuhtar {


    public static void main(String[] args) {


/*
        if (score >= 0 && score <= 100) {
            String result1 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                    : (score >= 60) ? "Passed" : "Failed";
            System.out.println(result1);
        } else {
            System.out.println("Invalid number");

        }

 */

        int score = 85;
        String result2= (score >= 0 && score <= 100)? (score >= 90) ? "Excellent"
                : (score >= 80) ? "Great" : (score >= 70) ? "Good"
                : (score >= 60) ? "Passed" : "Failed" :"invalid number";
        System.out.println(result2);






    }


}




