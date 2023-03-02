
import java.util.Random;
public class EmployeeWage{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static int empHrs = 0;
    public static int totalEmpHrs = 0;
    public static int numOfWorkingDays = 20;

    //Method for computing the wage for employee.
    private static void wageComputation() {
        Random random = new Random();
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is Present Full Time");
                empHrs = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part Time ");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent ");
                for (int i = 0; i < numOfWorkingDays; i++) {
                    empCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (empCheck) {
                        case IS_FULL_TIME:
                            empHrs = 8;
                            break;
                        case IS_PART_TIME:
                            empHrs = 4;
                            break;
                        default:
                    }
                    totalEmpHrs = totalEmpHrs + empHrs;
                }

                int empWage = empHrs * EMP_RATE_PER_HOUR;
                empWage = totalEmpHrs * EMP_RATE_PER_HOUR;
                System.out.println("Employee Wage is : " + empWage);
        }
    }

    // main method - starting point of EmpWageComputation program
        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
            wageComputation();
        }
    }