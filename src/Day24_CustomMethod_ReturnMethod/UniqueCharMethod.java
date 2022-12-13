package Day24_CustomMethod_ReturnMethod;

public class UniqueCharMethod {
    public static void main(String[] args) {
        String str="aabbccddlpj";
     int frequency1= frequency(str,'a');
        System.out.println(frequency1);


        for (int i = 0; i < str.length(); i++) {

            int frequency= frequency(str,str.charAt(i));
       if(frequency==1)
        System.out.println(str.charAt(i));
    }

    }
    public static int frequency (String str, char ch){
        int count= 0;
        for (char each : str.toCharArray()) {
            if(each==ch){
                count++;
            }
        }
        return count;
        
    }
}
