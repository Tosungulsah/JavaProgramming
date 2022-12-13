package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 5;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        if( grade >=1 && grade<=6){
            if (grade==1){
                location = "AppleOrchard";
                groupNumber= 3;
                teacher = "Ms Smith";
            } else if (grade==2 ) {
                location = "zoo";
                groupNumber= 7;
                teacher ="Mr Lee";
            } else if (grade==3) {
                location= "Aquarium";
                groupNumber = 5;
                teacher= "Ms. Wilson";
            } else if (grade==4) {
                location= "movie theatre";
                groupNumber=5;
                teacher="Ms Lela";
            }else {
                location="six flags";
                groupNumber= 8;
                teacher="Mr Watt";
            }

            System.out.println("location - " + location + "\n"+ "number of groups -"+groupNumber+"\n"+"teacher in charge - "+teacher);


        }else{
            System.out.println("invalid group number");
        }






    }


}
