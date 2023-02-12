package employeeWageOops;

public class PartTimeUsingConstructor {
    int isPartTime = 1;
    int isFullTime = 2;
    int employeeRatePerHour = 20;
    int employeeHrs = 0;
    int employeeWage = 0;

    public PartTimeUsingConstructor(int isPartTime, int isFullTime, int employeeRatePerHour, int employeeHrs, int employeeWage) {
        this.isPartTime = isPartTime;
        this.isFullTime = isFullTime;
        this.employeeRatePerHour = employeeRatePerHour;
        this.employeeHrs = employeeHrs;
        this.employeeWage = employeeWage;
        double employeeCheck = Math.floor(Math.random() * 10) % 3;
        if (employeeCheck == isPartTime) {
            employeeHrs = 4;
        } else if (employeeCheck == isFullTime) {
            employeeHrs = 8;
        } else {
            employeeHrs = 0;
        }
        employeeWage = employeeHrs * employeeRatePerHour;
        System.out.println(employeeWage);

    }

    public static void main(String[] args) {
        PartTimeUsingConstructor partTime= new PartTimeUsingConstructor(1,2,20,0,0);
    }
}

