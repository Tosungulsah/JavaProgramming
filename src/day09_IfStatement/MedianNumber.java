package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b= 15,
                c = 20;

        boolean aIsmedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsmedian = (b>a && b<c) || (b<a && b>c);
        boolean cIsmedian=  !aIsmedian && !bIsmedian ;//(c>a && c<b) || (c<a && c<b);

        if (aIsmedian){
            System.out.println(a+ " is median number.");
        }

        if (bIsmedian){
            System.out.println(b+ " is median number");
        }

        if(cIsmedian){
            System.out.println(c+ " is median number");
    }

    }
}
