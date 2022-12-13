package tasks;
public class GetEmail {
    public static void main(String[] args) {
        String email= "gulsah.tosun@gmail.com";

        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain: "+ domain);

        String firstName= email.substring(0,email.indexOf("."));

        String lastName=email.substring(email.indexOf(".")+1,email.indexOf("@"));
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.exit(0);
    }
}

