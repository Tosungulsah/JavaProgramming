package day15_ForLoop;

public class AlphabetForLoop {
    public static void main(String[] args) {

        //A-Z
        for (int a= 65; a<=90;a++ ){
            System.out.print((char)a+" ");
        }
        System.out.println();
        for(char i= 'A'; i<='Z'; i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(char i= 'a'; i<='z'; i++) {
            System.out.print(i + " ");
        }


        System.exit(0);
    }
}
