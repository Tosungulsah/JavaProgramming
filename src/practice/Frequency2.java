package practice;

public class Frequency2 {
    public static void main(String[] args) {
        String word = "Cat cat Dog Dog Cat Cat Dog Dog";
        word= word.toLowerCase();
        int countCat=0;
        while(word.contains("cat")){
            word= word.replaceFirst("cat","");
            countCat++;
        }
        System.out.println(countCat);
        System.exit(0);
    }
}
