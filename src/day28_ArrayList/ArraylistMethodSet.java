package day28_ArrayList;

import java.util.ArrayList;

public class ArraylistMethodSet {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Java"); lists.add("Python");lists.add("C++");
        System.out.println(lists);

        lists.set(1,"Ruby");
        System.out.println("New lists after set() method = " + lists);
    }
}
