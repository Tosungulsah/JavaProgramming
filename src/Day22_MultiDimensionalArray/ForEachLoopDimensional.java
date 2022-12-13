package Day22_MultiDimensionalArray;

public class ForEachLoopDimensional {
    public static void main(String[] args) {
        int [] [] arr2D= {{1,2,3}, {4,5,6,7}, {8,9,10,11,12}};

        for (int[] each : arr2D) {
            for (int eachelement : each) {


                System.out.println(eachelement);
            }
        }
    }
}
