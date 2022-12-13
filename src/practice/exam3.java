package practice;

public class exam3 {
    public static void main(String[] args) {

        int cookies = 10 ;
        String day="tuesday";
        switch (day){
            case "sunday":
                cookies ++;
            case "monday":
                cookies += 5;
                break;
            case "tuesday":
            case "wednesday":
                cookies+=10;


        }
        System.out.println(cookies);
        System.exit(0);
    }
}
