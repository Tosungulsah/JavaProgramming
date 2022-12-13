import java.util.ArrayList;
import java.util.Arrays;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String colour;

    public void setInfo(String dogName, String dogbreed, int dogAge, char dogGender, String dogSize, String dogcolour) {
        name = dogName;
        breed = dogbreed;
        age = dogAge;
        gender = dogGender;
        colour = dogcolour;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking ");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
class DogObjects{
    public static void main(String[] args) {
        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.colour = "White";
        System.out.println(dog1);

        day30_CustomClass.Dog dog2 = new day30_CustomClass.Dog();

        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 4;
        dog2.gender = 'M';
        dog2.size = "Medium";
        dog2.colour = "White";


        day30_CustomClass.Dog dog3 = new day30_CustomClass.Dog();
        dog3.setInfo("hack", "terrier", 4, 'M', "Small", "black");


        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.eat();
        dog3.eat();

        dog1.bark();
        dog2.bark();
        dog3.bark();

        day30_CustomClass.Dog dog4 = new day30_CustomClass.Dog();
        dog4.setInfo("Wolfie", "German Shepard", 4, 'F', "Large", "Brown");
        day30_CustomClass.Dog dog5 = new day30_CustomClass.Dog();
        dog5.setInfo("Luvy", "Labrador", 8, 'M', "Large", "Black");
        day30_CustomClass.Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        System.out.println(Arrays.toString(dogs));
        ArrayList<day30_CustomClass.Dog> femaleDog = new ArrayList<>();


        ArrayList<day30_CustomClass.Dog> maleDog = new ArrayList<>();


    }

    }
