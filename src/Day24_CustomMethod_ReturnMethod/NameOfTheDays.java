package Day24_CustomMethod_ReturnMethod;

public class NameOfTheDays {
    public static void main(String[] args) {
nameOfTheDay(5);

    }

    public static void nameOfTheDay(int number) {

        if (number < 1 || number > 7) {
            System.out.println("invalid");
            return;
        }
        String name ="";
        name = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number==3)? "Wednesday"
                :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday";
        System.out.println(name);
    }
}
