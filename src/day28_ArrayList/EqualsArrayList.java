package day28_ArrayList;

import java.util.ArrayList;

public class EqualsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

      boolean r=  list1.isEmpty();
        System.out.println(r);

    }

}
