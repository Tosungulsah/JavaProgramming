package day13_StringClass;

public class ReplaceMethod2 {
    public static void main(String[] args) {
        String s = "Dog Dog Dog Dog Dog Dog";
       s=  s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2= "C# is fun, C# is cool "; // if i want to replace 2. one
         s2= s2.replace(" C#","Java"); // because this has a gap before C#
        System.out.println("s2 = " + s2);

    }
}
