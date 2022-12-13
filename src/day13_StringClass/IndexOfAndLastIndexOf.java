package day13_StringClass;

public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        String name = "Java Nova Cava Wawa Orange";
        int firstA= name.indexOf("a");
        int lastA=name.lastIndexOf("a");
        int calloAfterN= name.indexOf("No")+1;

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("calloAfterN = " + calloAfterN);

        System.exit(0);
    }
}
