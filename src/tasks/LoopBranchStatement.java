package tasks;

public class LoopBranchStatement {
    public static void main(String[] args) {
        for (int i = 5; i <+100 ; i++) {

            if(i % 2 ==0 ){
                continue; // skip
            }
            System.out.print(i+" ");
        }
System.exit(0);
    }
}
