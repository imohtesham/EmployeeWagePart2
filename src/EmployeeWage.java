import java.util.Random;

public class EmployeeWage{
    private final int wagePerHour;
    private  double totalWage;
    private final int  numberOfDays;
    private final int totalHours;
    private final String Company;

    EmployeeWage(String Company, final int wagePerHour, final int numberOfDays, final int totalHours) {
        this.Company = Company;
        this.wagePerHour = wagePerHour;
        this.numberOfDays = numberOfDays;
        this.totalHours = totalHours;
    }
    public void settotalWage(double totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {

        return "Total Wage of the Person for the " + this.Company + " is " + this.totalWage;

    }
    public int getnumberOfDays() {

        return this.numberOfDays;
    }
    public int gettotalHours() {

        return this.totalHours;
    }
    public int getwagePerHour() {
        return this.wagePerHour;
    }

}





