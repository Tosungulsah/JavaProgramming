package day11_SwitchStatement;

public class DaysinWeek {
    public static void main(String[] args) {

            int number = 0;

            switch(number){ // 1,2,3,4,5,6,7
                case 1:
                    System.out.println("Monday");
                        break;
                case 2:
                    System.out.println("Tuesday");
                        break;
                case 3:
                    System.out.println("Wednesday");
                        break;
                case 4:
                    System.out.println("Thursday");
                        break;
                case 5:
                    System.out.println("Friday");
                    break;

                default:
                    System.out.println("Invalid Day Number");
                    break;
                case 6:
                    System.out.println("Saturday");
                        break;
                case 7:
                    System.out.println("Sunday");
                        break;

            }
// you can replace default any place in cases
    }
}
