package day30_CustomClass;

public class Dog {

   public String name;
   public String breed;
   public int age;
   public char gender;
   public String size;
   public String colour;

   public void setInfo(String dogName,String dogbreed,int dogAge,char dogGender, String dogSize, String dogcolour){
      name= dogName;
      breed= dogbreed;
      age= dogAge;
      gender=dogGender;
      colour=dogcolour;
   }

   public void eat(){
       System.out.println(name+ " is eating");
   }
   public void bark(){
       System.out.println(name+ " is barking ");
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





    /*
     attributes : name, age,gender,breed,size,colour

     Actions:
     eat(),play()
     */

}
