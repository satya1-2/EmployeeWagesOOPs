package employeeWageOops;

public class TotalWageForMonthUsingConstructor {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int NumOfWorkingDays = 20;
    int employeeHrs = 0;
    int employeeWage = 0;
    int totalEmployeeWage = 0;

    public TotalWageForMonthUsingConstructor(int employeeHrs, int employeeWage, int totalEmployeeWage) {
        this.employeeHrs = employeeHrs;
        this.employeeWage = employeeWage;
        this.totalEmployeeWage = totalEmployeeWage;
        for (int day = 0; day < NumOfWorkingDays; day++) {
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

            employeeWage = employeeHrs * empRatePerHour;
            totalEmployeeWage += employeeWage;
            System.out.println(" employee wage for month " + employeeWage);
        }

        System.out.println("total employee wage for month");
        System.out.println(totalEmployeeWage);

    }

    public static void main(String[] args) {
        TotalWageForMonthUsingConstructor totalWage = new TotalWageForMonthUsingConstructor(0, 0, 0);

    }
}
