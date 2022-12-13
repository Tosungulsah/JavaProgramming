package replit;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int count= 0;
        str= str.toLowerCase();
        for(int i=0; i<str.length()-1; i++){
            String eachSub= str.substring(i,i+2);

            while (eachSub.equalsIgnoreCase("hi")) {
                count++;


            }
        }
        System.out.println(count);
        System.exit(0);
    }
}

