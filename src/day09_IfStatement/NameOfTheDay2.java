package day09_IfStatement;

public class NameOfTheDay2 {
    public static void main(String[] args) {
        int a = 10;
            String day; // all variables are String so I can assign



        if (a == 1) {

          day = "Monday";// System.out.println("Monday");
        }
        else if (a==2){
          day= "Tuesday"; //  System.out.println("Tuesday");
        } else if (a ==3) {
            day= "Wednesday";//  System.out.println("Wednesday");
        } else if (a ==4) {
            day= "Thursday";// System.out.println("Thursday");
        }
        else if (a == 5){
            day= "Friday"; // System.out.println("Friday");
        }
        else if (a==6){
            day= "Saturday";// System.out.println("Saturday");
        }
        else{
            day= "Sunday";//System.out.println("Sunday");
        }

        System.out.println("The day is "+ day); // with this i have only one print statement 


    }
}
