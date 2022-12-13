package day08_IfStatement;

public class LogicalOperators3 {
    public static void main(String[] args) {

        String student = "Allen";

        double gpa = 3.5;
        int familyIncome= 100000;

        boolean isEligible = gpa>=3.5 || familyIncome <= 50000 ;

        System.out.println(student + " is eligible to get schoolarship : "+ isEligible);





    }
}
