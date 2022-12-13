package day15_ForLoop;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str= "Cydeo12345School!@  #WoodenSpoon";


        String digit =""; // 123456
        String letters = "";//CydeoWoodenSpoon
        String specialChars="";  // !@#

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // every character that we have in str
           if(ch>='0'&&ch<'9'){
               digit += ch;
           }else if(ch>='A'&& ch<='Z') {
               letters += ch;
           }else if(ch>='a'&&ch<='z'){
               letters+=ch;
           }else {
               if(ch != ' '){
                   specialChars+= ch;
               }

           }
        }

        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);






    }
}
