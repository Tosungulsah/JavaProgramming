package Day24_CustomMethod_ReturnMethod;

public class DomainOfTheEmail {
    public static void main(String[] args) {
        domainOfEmail("xxxxxxx@gmail.com");
System.exit(0);
    }

    public static void domainOfEmail(String email){
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
}
