package day31_CustomClass_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,Sm;
    public ArrayList<Tester>  testersList= new ArrayList<>();
    public ArrayList<Developer> devopList= new ArrayList<>();
    int daysOfSprint;

    public ScrumTeam(String PO, String BA, String sm, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        Sm = sm;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }
    public void addDeveloper(Developer developer){
        devopList.add(developer);
    }
    public void addDevelopers(Developer[] developers) {
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
