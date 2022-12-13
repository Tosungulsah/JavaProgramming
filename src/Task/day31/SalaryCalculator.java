package Task.day31;

public class SalaryCalculator {
    public int weeklyHours;
    public double hourlyRate,stateTaxRate,federalTaxRate;

    public SalaryCalculator(int weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
    }
    public double salary (){
        return  hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return  salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "weeklyHours= " + weeklyHours +
                ", hourlyRate= £" + hourlyRate +
                ", stateTaxRate= £" + stateTaxRate +
                ", federalTaxRate= £" + federalTaxRate +
                '}';
    }
}

