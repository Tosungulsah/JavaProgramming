package day31_CustomClass_Constructor;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1= new Person("Gulsah",'F',35);
        Person person2= new Person("Kemal",'M',6);

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);

        person2.age=7;
        System.out.println("after new assisgnment person2 = " + person2);
        System.exit(0);
    }
}