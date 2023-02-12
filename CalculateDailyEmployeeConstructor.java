package employeeWageOops;

public class CalculateDailyEmployeeConstructor {
    int IsFullTime = 1;
    int EmployeeRatePerHrs = 20;
    int EmployeeHrs = 8;
    int employeeWages = 0;
    public CalculateDailyEmployeeConstructor(int isFullTime, int employeeRatePerHrs, int employeeHrs, int employeeWages) {
        IsFullTime = isFullTime;
        EmployeeRatePerHrs = employeeRatePerHrs;
        EmployeeHrs = employeeHrs;
        this.employeeWages = employeeWages;
        double employeeCheck = Math.floor(Math.random() * 20) % 2;
        if (employeeCheck == isFullTime) {
            employeeHrs = 8;
        } else {
            employeeHrs = 0;
        }
        employeeWages = employeeHrs * employeeRatePerHrs;
        System.out.println(employeeWages);

    }
    public static void main(String[] args) {
        CalculateDailyEmployeeConstructor constructor = new CalculateDailyEmployeeConstructor(1, 20, 8, 0);
    }
}

