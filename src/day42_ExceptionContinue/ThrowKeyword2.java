package day42_ExceptionContinue;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("There is no such element as a break");

        // System.out.println("Hello");// you cant write after throw
    }
}
