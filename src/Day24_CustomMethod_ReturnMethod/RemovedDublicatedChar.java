package Day24_CustomMethod_ReturnMethod;

public class RemovedDublicatedChar {
    public static void main(String[] args) {
     String str1 = "aaadddbbdd";
        String str= removeDublicated(str1);
        System.out.println(str);
    }

    public static String removeDublicated(String str ){
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result +=each;
            }
        }

return result;
    }

}
