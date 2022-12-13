package day29_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovePractiseArrayList {
    public static void main(String[] args) {
        String[] names= {"monica","Meyra","Ayse","Zehra","Kemal","Ercu","Ekin"};

        ArrayList<String> list= new ArrayList<>(Arrays.asList(names));
        System.out.println(list);

        list.removeIf(p-> p.charAt(0)=='M');
        System.out.println(list);

        names= list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
