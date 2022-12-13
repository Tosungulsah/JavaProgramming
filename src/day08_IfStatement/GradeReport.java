package day08_IfStatement;

public class GradeReport  {

    public static void main(String[] args) {
       /* System.out.println( true == !false); //true
        System.out.println(!true != false);  //false
        System.out.println(!false == true); //true

        System.out.println(!!false); //false
        System.out.println(!!!true); // false
    */

/*
score =
90 100 .. excellent
80 89 ..... great
70 79  .... good
60-69
0- 59 ..... failed
 */

        int score = 85 ;

        boolean a =score  >=90 && score <=100 ;
        boolean b =score >= 80 && score <=89 ;
        //bolean b score >= 80 && !a;
        boolean c =score >= 70 && score <=79 ;
        //boolean c =!a && !bb && score >=79
        boolean d =score >=60 && score <=69;
        boolean e = score >=0 && score <59;

        if(a){
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }
        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(e){
            System.out.println("Failed");
        }


    }

}