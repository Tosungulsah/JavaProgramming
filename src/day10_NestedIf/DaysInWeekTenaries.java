package day10_NestedIf;

public class DaysInWeekTenaries {
    public static void main(String[] args) {


        int number = 5;

        if(number >=1 &&number <8) {
            String days = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
            System.out.println(days);
        }
        else {
            System.out.println("Invalid, please enter valid number");
        }

    }
}
