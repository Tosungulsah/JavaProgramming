package day40_FinalKeyword;

public class FinalVariable {
    final String birthDay;
    final static String name;

    static {
        name = "Batch";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {


        final double pi = 3.14;

        final String name;
        name = "Java";
        //   name= "wooden spoon"; cant assign again


        FinalVariable obj = new FinalVariable("Jan/22");

        // obj.birthday= "xxx"; i cant assign again

        System.out.println(obj.birthDay);

        System.out.println("**************************************************");

        System.out.println(FinalVariable.name);
    }
}