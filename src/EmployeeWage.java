public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeWage e = new EmployeeWage();
        e.empCheck();

    }
    public void empCheck() {
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        final int EMP_RATE_PER_HR = 20;
        final int NO_OF_WORKING_DAYS = 20;
        final int MAX_HR_PER_MONTH = 100;

        // initializing variable
        int empHrs = 0;
        int	totalEmpWage = 0;
        int	totalEmpHrs = 0;
        int	totalWorkingDays = 0;
        // computation

        while (totalEmpHrs <= MAX_HR_PER_MONTH && totalWorkingDays <NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println(" Day: " + totalWorkingDays);
            System.out.println(" Dailly Employee Hour: " + empHrs);
            System.out.println(" Total Employee hour: " + totalEmpHrs);
            System.out.println(" ");
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println(" Employee Wages For a Month: " + totalEmpWage);
    }
}