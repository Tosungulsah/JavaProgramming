package day28_ArrayList;

public class StringPassword {
    public static void main(String[] args) {
         /*
          password must have 8 chars
          1 upper case, 1 lower case ,1 special char, 1 digit
          */
        String password= "Cydeo1990@";
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4= false;  // has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2= true;
            }
            else if(Character.isLowerCase(each)){
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else{ // special char
                r4=true;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5 ;
        System.out.println("isStrongPassword = " + isStrongPassword);

        System.exit(0);
    }
}
