package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntegerPractise {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);list.add(200);list.add(300);list.add(400);list.add(500);
        System.out.println("list = " + list);
       // list.remove(1);
        Integer num=300;
        //list.remove(num);
        boolean r = list.remove(num);
        System.out.println("New list = " + list);
        System.out.println(r);

        System.out.println(list.size());
        list.clear();
        System.out.println("list = " + list);
    }
}
