package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = '%';
            String name = "";
      if  (ch>='0' && ch <='9'){
          name= "Digit";
      } else if ((ch >= 'A'&& ch <= 'Z') ||(ch >='a' && ch <= 'z')){
             name= "Alphabetic";
        }else{
          name = "Special Character";
      }
        System.out.println(name);


/*
        System.out.println("Digit");
        System.out.println("Alphabetic");
        System.out.println("Special Character");
*/



    }
}
