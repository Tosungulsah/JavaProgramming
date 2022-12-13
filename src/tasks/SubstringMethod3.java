package tasks;

public class SubstringMethod3 {
    public static void main(String[] args) {
        String sentence= "Java is fun, Java is cool.";
        //                012345678910
        int indexNumbersTotal= sentence.length();
        String upperCase= sentence.toUpperCase();
        String lowerCase= sentence.toLowerCase();

        String firstSentence= sentence.substring(0,11);
        int beg= sentence.lastIndexOf("J");
        String secondSentence= sentence.substring(beg);
        System.out.println("sentence = " + sentence);
        System.out.println("indexNumbersTotal = " + indexNumbersTotal);
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("firstSentence = " + firstSentence);
        System.out.println("secondSentence = " + secondSentence);
        System.exit(0);
    }
}
