package MentorDays;

public class Interview {
    public static void main(String[] args) {
        int[] arr= {1,20,80,10000};
            int sum=0;
        for (int each : arr) {
            if((-99< each && each<-10) || (99>each && each>10) ){
                sum+= each;
            }
        }
        System.out.println(sum);
    }
}
