import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {
        //4 testers objects
        day31_CustomClass_Constructor.scrumTask.Tester tester1 = new day31_CustomClass_Constructor.scrumTask.Tester("Gulsah",124563,"QA",25000);
        day31_CustomClass_Constructor.scrumTask.Tester tester2=new day31_CustomClass_Constructor.scrumTask.Tester("Ercu",4521,"SDET",22000);
        day31_CustomClass_Constructor.scrumTask.Tester tester3=new day31_CustomClass_Constructor.scrumTask.Tester("Kemal",4524,"SDET",21000);
        day31_CustomClass_Constructor.scrumTask.Tester tester4=new day31_CustomClass_Constructor.scrumTask.Tester("Ercu",45234,"Tester",22000);

        day31_CustomClass_Constructor.scrumTask.Tester[] testers={tester1,tester2,tester3,tester4};
        //5 devop objects
        day31_CustomClass_Constructor.scrumTask.Developer developer1= new day31_CustomClass_Constructor.scrumTask.Developer("Merve",45444,"SDE",45000);
        day31_CustomClass_Constructor.scrumTask.Developer developer2= new day31_CustomClass_Constructor.scrumTask.Developer("Onur",45447,"Dev",43000);
        day31_CustomClass_Constructor.scrumTask.Developer developer3= new day31_CustomClass_Constructor.scrumTask.Developer("Nil",454444,"Dev",47000);
        day31_CustomClass_Constructor.scrumTask.Developer developer4= new day31_CustomClass_Constructor.scrumTask.Developer("Ahmet",4547777,"Dev",50000);
        day31_CustomClass_Constructor.scrumTask.Developer developer5= new day31_CustomClass_Constructor.scrumTask.Developer("Selin",4544111,"Dev",44000);
        day31_CustomClass_Constructor.scrumTask.Developer[] developers= {developer1,developer2,developer3,developer4,developer5};

        //1scrum team object

        day31_CustomClass_Constructor.scrumTask.ScrumTeam scrum= new day31_CustomClass_Constructor.scrumTask.ScrumTeam("Tosun","Usta","Scrum Master",14 );
        System.out.println("scrumTeam = " + scrum);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println("scrum = " + scrum);
    }

}

class Tester{
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;


    public Tester(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= £" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+ " is smoke testing.");
    }
    public void createTicket(){
        System.out.println(name + " is creating ticket.");
    }


}
class Developer{
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= £" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name+ " is coding.");
    }
    public void unitTesting(){
        System.out.println(name+ " unit testing.");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing bugs.");
    }

}
class ScrumTeam{
    public String PO,BA,Sm;
    public ArrayList<day31_CustomClass_Constructor.scrumTask.Tester> testersList= new ArrayList<>();
    public ArrayList<day31_CustomClass_Constructor.scrumTask.Developer> devopList= new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String sm, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        Sm = sm;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_CustomClass_Constructor.scrumTask.Tester tester){
        testersList.add(tester);
    }
    public void addTesters(day31_CustomClass_Constructor.scrumTask.Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }
    public void addDeveloper(day31_CustomClass_Constructor.scrumTask.Developer developer){
        devopList.add(developer);
    }
    public void addDevelopers(day31_CustomClass_Constructor.scrumTask.Developer[] developers) {
        devopList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID==employeeID );
    }
    public void removeDevop(int employeeID){
        devopList.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", Sm='" + Sm + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total numberof devops=" + devopList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }


}