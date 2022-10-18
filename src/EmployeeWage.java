public class EmployeeWage{

    public static final int IS_PART_TIME  = 1;
    public static final int IS_FULL_TIME  = 2;

    private final String company;
    private final int empRatePerHrs;
    private final int numOfWorkingDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;

    public EmployeeWage(String company, int empRatePerHrs, int numOfWorkingDays, int maxHrsPerMonth){

        this.company = company;
        this.empRatePerHrs = numOfWorkingDays;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void computeEmpWage(){

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        //computation

        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays){

            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random()*10)%3;

            switch (empCheck){

                case IS_PART_TIME :
                    empHrs = 4;
                    break;
                case IS_FULL_TIME :
                    empHrs = 8;
                    break;
                default :
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : "+totalWorkingDays + "Emp Hr : " + empHrs);
        }

        totalEmpWage =  totalEmpHrs * empRatePerHrs;
    }

    //@override
    public String toString(){

        return "Total Emp Wage For Company : "+company + " is : "+totalEmpWage;
    }

    public static void main(String [] args){

        EmployeeWage dmart = new  EmployeeWage("D-mart", 20, 2, 10);
        EmployeeWage relince = new  EmployeeWage("Relince", 10, 4, 20);
        dmart.computeEmpWage();
        System.out.println(dmart);

        relince.computeEmpWage();
        System.out.println(relince);
    }
}