package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
     Dog dog1= new Dog();

     dog1.name="Lucy";
     dog1.breed="Husky";
     dog1.age=5;
     dog1.gender='F';
     dog1.size= "Small";
     dog1.colour="White";
     System.out.println(dog1);

    Dog dog2= new Dog();

    dog2.name="Ace";
    dog2.breed="Husky";
    dog2.age=4;
    dog2.gender='M';
    dog2.size= "Medium";
    dog2.colour="White";


    Dog dog3= new Dog();
    dog3.setInfo("hack","terrier",4,'M',"Small","black");




        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.eat();
        dog3.eat();

        dog1.bark();
        dog2.bark();
        dog3.bark();

        Dog dog4= new Dog();
        dog4.setInfo("Wolfie","German Shepard",4,'F',"Large","Brown" );
        Dog dog5= new Dog();
        dog5.setInfo("Luvy","Labrador",8,'M',"Large","Black");
        Dog[] dogs= {dog1, dog2,dog3, dog4,dog5};

        System.out.println(Arrays.toString(dogs));
        ArrayList<Dog> femaleDog = new ArrayList<>();


        ArrayList<Dog> maleDog= new ArrayList<>();




    }

}
