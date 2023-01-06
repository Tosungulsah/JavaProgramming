package day44_Opp_AbstractionContinue.AnimalTask;

public abstract class Animal implements Playable{
    private String name,size;
    private final String breed, colour;
    private final char gender;
    private int age;

    @Override
    public void play() {

    }

    public final static boolean canBreath;

    static{
        canBreath=true;
    }

    public Animal(String name, String size, String breed, String colour, char gender, int age) {
        setName(name);
        setSize(size);
        this.breed = breed;
        this.colour = colour;
        if(!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid gender"+ gender);
        }
        this.gender = gender;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.isEmpty()){
           throw new RuntimeException();
       }

        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void drink(){
        System.out.println(name+"is drinking");
    }
    public abstract void eat();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }



    }

