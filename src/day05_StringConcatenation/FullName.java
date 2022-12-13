package day05_StringConcatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName= "Gulsah";
        String surname= "Tosun";
        int age= 35;
        String jobTitle = "Biologist";

        String companyName = "jm";



        String fullName= firstName + " " + surname ;

        System.out.println("Full name of the person is " + fullName);

        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is "+ jobTitle + ", works at " + companyName + ".");
    }
}
