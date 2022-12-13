package day19_LoopPractises;

public class FrequencyOfCharacter {

    /* str= aabcccd"
    output a2b1c3d1
     */
    public static void main(String[] args) {

        String a = "aabcccd";
        String result ="";


        for (int j = 0; j < a.length(); j++) {
            char ch = a.charAt(j);  // each character from string
            int count = 0;


            for (int i = 0; i < a.length(); i++) { // find the frequency of each character
                char each = a.charAt(i); // each character of string
                if (ch == each) {
                    count++;
                }
            }
            if(result.contains(""+ch)) {
                continue;
            }
            result+=ch ;
            result+= count;

        }
        System.out.println(result);

        }

    }




