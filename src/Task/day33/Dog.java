package Task.day33;

public class Dog {
    public String name, breed, colour,size;
    public int age;
    public char gender;
    public static int numberOfLegs= 4;
    public static int numberOfEyes= 2;
    public static int numberOfWings=0;
    public static boolean isFriendly= true;

    public Dog(String name, String breed, String colour, String size, int age, char gender) {
        this.name= name;
        this.breed = breed;
        this.colour = colour;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+ " is eating.");
    }
    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
