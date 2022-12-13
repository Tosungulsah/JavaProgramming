package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,8,8,3,5));
        System.out.println(list);

      list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,400));

        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        ArrayList<String> jobTitles= new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","QA","Java Developer","Scrum MAster"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        ArrayList<Integer> numbers2= new ArrayList<>();

        numbers2.addAll(Arrays.asList(1,5,1,2,4,3,6,7,8,9,10));
        boolean r1= numbers2.contains(10);
        System.out.println(r1);

        boolean containsAllCheck = numbers2.containsAll(Arrays.asList(10,2,3));
        System.out.println(containsAllCheck);
    }
}
