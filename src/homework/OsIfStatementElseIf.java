package homework;

public class OsIfStatementElseIf {
    public static void main(String[] args) {

        String Os= "Mac";


        if(Os == "Samsung"){
            System.out.println("Android ");
        }
        else if (Os == "Lenovo"){
            System.out.println("Windows");
        }
        else if(Os == "Iphone"){
            System.out.println("IOS");
        }
        else {   // Mac
            System.out.println("MacOS");
            System.exit(0);
        }

    }

}
/*
 Write a java program in order to learn to OS
 Mac     ->     MacOS
 Lenova  ->     Windows
 Iphone  ->     IOS
 Samsung ->     Android

 input : Mac
 output: MacOS
 */






