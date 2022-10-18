public class EmployeeWage{

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public void computeWage(String cmpName, int empRatePerHr, int numOfWorkingDays, int maxHrsInMonth){

//		initializing variable
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDays){

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random()*10%3);

            switch (empCheck){

                case IS_FULL_TIME :
                    empHrs = 8;
                    break;

                case IS_PART_TIME :
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : "+totalWorkingDays + " Emp Hr : "+empHrs);

        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Toatal Emp Wage for company : "+cmpName + " is : "+totalEmpWage);
    }
    public static void main(String [] args){

        EmployeeWage uc8 = new EmployeeWage();
        uc8.computeWage("D-mart",20,2,10);
        uc8.computeWage("Relince",10,4,20);

    }
}