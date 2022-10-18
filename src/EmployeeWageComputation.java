import java.util.Random;

public class EmployeeWageComputation {
    private static int numOfCompanies = 0;
    private EmployeeWage[] CompanyWageArray;
    EmployeeWageComputation() {
        CompanyWageArray = new EmployeeWage[5];
    }
    public void addCompany(String Company, final int wagePerHour, final int numberOfDays, final int totalHours) {
        EmployeeWage CompanyEmpWage_Obj = new EmployeeWage(Company, wagePerHour, numberOfDays, numberOfDays);
        CompanyWageArray[numOfCompanies] = CompanyEmpWage_Obj;
        numOfCompanies++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < this.numOfCompanies; i++) {
            double totalWage = computeEmpWageHelper(CompanyWageArray[i]);
            CompanyWageArray[i].settotalWage(totalWage);
            System.out.println(CompanyWageArray[i]);
        }
    }

    private double computeEmpWageHelper(EmployeeWage CompanyEmpWage_Obj) { //Declaring Random Class
        Random rand = new Random();
        //Genertaing random number in range [0,2]
        //1-Present
        //2-PartTime
        //0-Absent
        //Looping for 20 days
        double totalWage = 0;
        int day = 0;
        int fullDayHour = 0;

//      condition Check
        while (day < CompanyEmpWage_Obj.getnumberOfDays() && fullDayHour <= CompanyEmpWage_Obj.gettotalHours()) {
            final int ISPRESENT = rand.nextInt(3);
            switch (ISPRESENT) {
                case 1:
                    fullDayHour += 8;
                    break;
                case 2:
                    fullDayHour += 4;
                    break;
                default:
                    System.out.println("Invalid Value");
                    day += 1;
            }
        }

        totalWage = CompanyEmpWage_Obj.getwagePerHour() * fullDayHour;
        return totalWage;


    }


    public static void main(String[] args)

    { //creating call objects
        EmployeeWageComputation e1 = new EmployeeWageComputation();
        e1.addCompany("Reliance", 30, 30, 120);
        e1.addCompany("Dmart", 20, 40, 100);
        e1.addCompany("Google", 20, 40, 100);
        e1.computeEmpWage();

    }
}