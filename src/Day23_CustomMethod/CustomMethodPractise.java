package Day23_CustomMethod;

public class CustomMethodPractise {
    // create a function that can print hello world 5 times
    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
    }



    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }



    // create a function that can print hello Cydeo 5 times

    public static void helloCydeo5Times(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello Cydeo");
    }

}

}
