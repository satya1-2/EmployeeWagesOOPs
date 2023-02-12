package employeeWageOops;

import java.util.Scanner;

public class EmployeeWageMultipleClass {
public static final int isPartTime=1;
public static final int isFullTime=2;
public static int computeEmployeeWage(String company,int employeeRatePerHour,int numOfWorkingDays,int maxHourPerMonth){
    int employeeHrs=0,totalEmployeeHrs=0,totalWorkingDays=0;
    while(totalEmployeeHrs<= maxHourPerMonth && totalWorkingDays<numOfWorkingDays) {
        totalWorkingDays++;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeeCheck) {
            case isPartTime:
                employeeHrs = 4;
                break;
            case isFullTime:
                employeeHrs = 8;
                break;
            default:

                employeeHrs = 0;
        }
        totalEmployeeHrs += employeeHrs;
        System.out.println("days: " + totalWorkingDays + "employee hr : " + employeeHrs);
    }
int totalWage=totalEmployeeHrs+employeeRatePerHour;
    System.out.println("total employee wage of company : "+ company +"is :"+totalWage);
    return totalWage;
    }

    public static void main(String[] args) {
        computeEmployeeWage("DMart",20,2,10);
        computeEmployeeWage("reliance",10,4,20);
    }
}
