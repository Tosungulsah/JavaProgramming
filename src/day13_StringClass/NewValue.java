package day13_StringClass;

public class NewValue {
    public static void main(String[] args) {
        String s3= "java";
        s3= s3.replace("a","e");
        System.out.println("s3 = " + s3);

        String result = "Java Java Java";
        result= result.replaceFirst("Java","Python"); // first matching will be python
        System.out.println("result = " + result);
    }
}
