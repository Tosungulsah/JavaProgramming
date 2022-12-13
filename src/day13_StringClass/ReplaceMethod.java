package day13_StringClass;

public class ReplaceMethod {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2= str.replace("Java", "Python");
        System.out.println("str2 = " + str2);

        String email= "johnsmith@yahoo.com";
        email= email.replace("yahoo", "gmail");
        System.out.println("email = " + email);

        System.exit(0);

    }
}
