package day37_Inheritance.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {
      String company= "Amazon Inc";

        ProductOwner po = new ProductOwner("Gulsah",35,'F',company,45454,452225);
        BusinessAnalyst ba= new BusinessAnalyst("Alex",44,'F',company,4444,78444);
        ScrumMaster sm= new ScrumMaster("GGG",41,'M',company,5555,75481);
        Tester tester1 = new Tester("dhdhd",32,'F',"QA",company,441,456221);
        Tester tester2 = new Tester("dhgjg",34,'m',"QE",company,444,454421);
        Tester tester3 = new Tester("dhgddd",32,'F',"Sdet",company,4444,122233);
        Tester tester4 = new Tester("dhgggggg",32,'F',"QE",company,435,1162244);
        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1= new Developer("daniela",36,'F',"Java Developer",company,555,777770);

        ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println("*********************************************");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+":"+ tester.salary);
        }
        System.out.println("********************************************************************************");

    }
}
