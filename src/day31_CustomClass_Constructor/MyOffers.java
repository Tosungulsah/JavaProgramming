package day31_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1= new Offer();

        offer1.setInfo("UK","Amazon","QA",38000,true,true,true);


        Offer offer2= new Offer();
        offer2.setInfo("Turkey","Facebook","Sdet",15000,false,true,false);

        Offer offer3= new Offer();
        offer3.setInfo("Germany","Twitter","SDE",20000,false,true,true);

        Offer offer4= new Offer();
        offer4.setInfo("USA","Amazon","Manual tester",12000,true,false,true);

        Offer offer5= new Offer();
        offer5.setInfo("Spain","Gestamp","QA",12000,true,false,true);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);

        Offer[] allOffers= {offer1,offer2,offer3,offer4,offer5};
        System.out.println("All Offers "+ Arrays.toString(allOffers));

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(allOffers));
                fullTimeOffers.removeIf(p-> !p.isFullTime);

        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("Fulltime numbers= " + fullTimeOffers.size());

        System.out.println("*****************************************************************");

        ArrayList<Offer> localArea= new ArrayList<>(Arrays.asList(allOffers));

        localArea.removeIf(p-> !p.equals("UK"));

        System.out.println("Jobs are from UK: "+ localArea);
        System.out.println("local job offers: "+ localArea.size());



System.exit(0);


    }
}
