package Day24_CustomMethod_ReturnMethod;

import java.util.Arrays;

public class DomainFromArrayEmails {
    public static void main(String[] args) {
    String[] emails={"xxxx@gmail.com", "gghghghg@hotmail.com", "fjdkfjkdfj@cydeo.com"};

       // for (int i = 0; i < emails.length; i++) {
           // domainOfEmail(emails[i]);
for(String email : emails){
    domainOfEmail(email);

        }


    }
    public static void domainOfEmail(String email){
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
}
