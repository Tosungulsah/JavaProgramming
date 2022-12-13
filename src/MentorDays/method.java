package MentorDays;

public class method {
    public static int solution(int[] A ){
        int sum =0;
        for(int each: A){
            if((each>9 && each<100)|| (each<-9 && each>-100)){
                sum+= each;
            }
        }
        return sum;
    }
}
