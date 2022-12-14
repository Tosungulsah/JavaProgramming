package day31_CustomClass_Constructor.scrumTask;

public class Developer {
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
