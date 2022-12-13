package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> employees= new ArrayList<>();
        employees.add("Gulsah"); employees.add("Sirin"); employees.add("Kemal");employees.add("Ekin");

        System.out.println(employees);
        employees.remove(0);
        System.out.println("employees = " + employees);

        employees.remove("Sirin");
       // employees.remove(employees.size()-1);  last index
        System.out.println("employees = " + employees);
    }
}
