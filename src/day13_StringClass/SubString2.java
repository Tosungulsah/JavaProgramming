package day13_StringClass;

public class SubString2 {
    public static void main(String[] args) {
        String word= "Java Programming Language";
        String s1= word.substring(0,word.indexOf(" "));
        String s2= word.substring(word.indexOf(" ")+1,word.lastIndexOf(" "));
        String s3= word.substring(word.lastIndexOf(" ")+1); // this mean till the end you dont need to second index

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.exit(0);
    }
}
