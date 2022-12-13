package Day24_CustomMethod_ReturnMethod;

public class CalculateTheGrade {

    public static void main(String[] args) {
 String str=  grade(-12);



 if(str.equals("A")){
     System.out.println("Excellent");
 }else if(str.equals("B")){
     System.out.println("Great");
 } else if (str.equals("C")) {
     System.out.println("Good");
 } else if (str.equals("D")) {
     System.out.println("Passed");
 }else{
     System.out.println("Try again!");
 }


    }
    public static String  grade(int score){
        String result= "";

        if(score<0 || score>100){
            System.out.println("invalid");

        }else {
            result = (score >= 90) ? "A" :(score>=80)? "B" :(score >=70)? "C" :(score>=60)? "D" : "F";
            //System.out.println(result);
        }
return result;
    }

}
