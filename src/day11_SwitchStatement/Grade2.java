package day11_SwitchStatement;

public class Grade2 {
    public static void main(String[] args) {
        char ch='B';
        String result = "";
        switch(ch){
            case 'A':
                case 'B':
            case 'C':
            case 'D':
                result= "Passed";
                break;
            default:
                result= "Failed";
                break;
        }
        System.out.println(result);

    }
}
// if the grade a,b,c,d, passed
//others are failed