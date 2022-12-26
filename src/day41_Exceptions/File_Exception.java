package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Exception {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
