package day11_SwitchStatement;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Chrome";
        String result = "";

       boolean validBrowser= browserName=="Chrome"|| browserName=="Firefox"|| browserName == "Opera" ||browserName == "Safari" || browserName == "edge";

       if (validBrowser){

           if(browserName=="Chrome"){
               result ="Chrome browser is selected.";
           }else if (browserName=="Firefox"){
               result= "Firefox browser is selected." ;
           } else if (browserName == "Opera") {
               result = "Opera browser is selected." ;
           }else if (browserName == "Safari"){
               result ="Safari browser is selected." ;
           } else{
               result= "Edge browser is selected." ;
           }

           System.out.println(result);
       }else {
                result= "invalid";
          System.out.println("Invalid Browser");
       }




    }
}
