package Day24_CustomMethod_ReturnMethod;

public class ReturnStatement2 {
    public static void main(String[] args) {
        nameOfTheMonth(1);
        System.exit(0);
    }

    public static void nameOfTheMonth(int number) {
        if (number < 1 || number > 12) {
            System.out.println("invalid");
            return;
        }

        String name = "";

            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November"
                    : "December";

            System.out.println(name);
        }
    }
