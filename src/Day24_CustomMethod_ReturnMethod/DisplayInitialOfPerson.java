package Day24_CustomMethod_ReturnMethod;

public class DisplayInitialOfPerson {
    public static void main(String[] args) {
    initialOfPerson("Gulsah","Tosun");
System.exit(0);
    }

    public static void initialOfPerson(String firstName,String lastName){
        System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

    }
}
