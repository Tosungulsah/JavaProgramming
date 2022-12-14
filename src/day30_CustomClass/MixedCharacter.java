package day30_CustomClass;

import java.util.ArrayList;

public class MixedCharacter {
    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars); // add all the characters

        letters.removeIf(p -> !Character.isLetter(p)); //remove the characters that are not letters

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( chars ); // add all the characters
        digits.removeIf( p -> !Character.isDigit(p)); //remove the characters that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>( chars);

        // specialChar.removeAll( letters );
        //  specialChar.removeAll( digits );
        specialChar.removeIf( p ->  Character.isLetterOrDigit(p) );

        System.out.println("specialChar = " + specialChar);

    }

}
