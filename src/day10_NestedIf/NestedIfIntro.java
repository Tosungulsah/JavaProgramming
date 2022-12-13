package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = -12 ;

       if(score >= 0 && score<=100) { //if the score is valid

           if (score >= 60) {

               System.out.println("passed");
           } else { // if the student failed exam
               System.out.println("Failed");
           }
       }
           else{
               System.out.println("invalid Score");
           }


       }

    }

