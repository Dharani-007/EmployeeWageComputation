import java.util.Random;

public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;


    // Method for computing the wage for employee.
    // Class method for computing the wage for employee.

    private static void wageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMont) {
        int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
        Random random = new Random();
        while (totalEmpHrs < maxHoursPerMont && totalWorkingDays < numOfWorkingDays) {
            while (totalEmpHrs < maxHoursPerMont && totalWorkingDays < numOfWorkingDays) {
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case IS_FULL_TIME:

                }

                int empWage = totalEmpHrs * empRatePerHour;
                System.out.println("Employee Wage for company " + company + " is : " + empWage);
                System.out.println("Employee Wage for company " + company + " is : " + empWage);
            }
        }
    }
    //  main method - starting point of EmpWageComputation program.


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        wageComputation("Reliance", 20, 2, 10);
        wageComputation("Bsnl", 30, 4, 14);
    }

}
