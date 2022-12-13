package day31_CustomClass_Constructor.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers objects
        Tester tester1 = new Tester("Gulsah",124563,"QA",25000);
        Tester tester2=new Tester("Ercu",4521,"SDET",22000);
        Tester tester3=new Tester("Kemal",4524,"SDET",21000);
        Tester tester4=new Tester("Ercu",45234,"Tester",22000);

        Tester[] testers={tester1,tester2,tester3,tester4};
        //5 devop objects
        Developer developer1= new Developer("Merve",45444,"SDE",45000);
        Developer developer2= new Developer("Onur",45447,"Dev",43000);
        Developer developer3= new Developer("Nil",454444,"Dev",47000);
        Developer developer4= new Developer("Ahmet",4547777,"Dev",50000);
        Developer developer5= new Developer("Selin",4544111,"Dev",44000);
        Developer[] developers= {developer1,developer2,developer3,developer4,developer5};

        //1scrum team object

        ScrumTeam scrum= new ScrumTeam("Tosun","Usta","Scrum Master",14 );
        System.out.println("scrumTeam = " + scrum);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println("scrum = " + scrum);
    }
}
