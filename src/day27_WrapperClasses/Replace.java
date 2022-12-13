package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {
    // create a method named replace that passes three parametres : integer array, integer index, integer newElement
    //arr= {1,2,3,4,5}
    // replace(arr,2,30).  {1,2,30,4,5}

      public static void main(String[] args) {
          int[] arr= { 77,88,6,5,4,};
          arr= replace(arr,2,88);
           System.out.println(Arrays.toString(arr));


           String[] str={"Gulsah", "is","learning","Java"};
           str= ArraysUtility.replace(str,0,"She");
           System.out.println(Arrays.toString(str));
     }


     public static int[] replace(int[] array, int index, int newElement){

          if(index<0 || index> array.length-1){
               System.err.println("invalid index: "+ index);
               System.exit(0);
          }
          array[index]= newElement;
          return array;

     }
}
