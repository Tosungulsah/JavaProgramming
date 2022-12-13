package day36_Inheritance.animalTask;

public class Animal {
   // name, breed, gender, size, age, color
        public String name, breed, colour,size ;
        public char gender;
        public int age;

    public void setInfo(String name, String breed, String colour, char gender, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }



    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void  move(){
        System.out.println(name+" is moving");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                '}';
    }
    /*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()
 */
}
