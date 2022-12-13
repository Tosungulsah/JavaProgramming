package Day24_CustomMethod_ReturnMethod;

public class NameOfMonthMethod {
    public static void main(String[] args) {

nameOfTheMonth(5);
    }

    public static void nameOfTheMonth(int number){

        String name= "";
        if(number >= 1 && number<=12){
            name= (number==1)? "January" :(number==2)? "February" :(number==3)? "March" :(number==4)? "April"
                    :(number==5)? "May" :(number==6)? "June" :(number==7)? "July" :(number==8)? "August"
                    :(number==9)? "September" :(number==10)? "October" :(number==11)? "November"
                    : "December";
        }else{
            name="invalid";
        }
        System.out.println(name);
    }
}
