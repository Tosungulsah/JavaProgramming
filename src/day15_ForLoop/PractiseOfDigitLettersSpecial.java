package day15_ForLoop;

public class PractiseOfDigitLettersSpecial {
    public static void main(String[] args) {
        String word = "Abcdgskf5656460000  djsdkf()";

      String digit="";
      String letters="";
      String special="";

      for (int i = 0; i < word.length(); i++) {

          char ch=word.charAt(i);

          if(ch>='0' && ch<='9'){
              digit +=ch;
          }else if (ch>='a'&& ch<='z'|| ch>='A'&&ch <= 'Z') {
              letters += ch;
             }else{
              if (ch != ' '){ // if the character is not a space
                special += ch;
              }
          }

        }
        System.out.println("digit = " + digit);
        System.out.println("letters = " + letters);
        System.out.println("special = " + special);
    }
}
