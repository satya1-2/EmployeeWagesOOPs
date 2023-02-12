package employeeWageOops;

public class TotalWorkingDaysMonthConstructor {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int employeeRatePerHour = 20;
    public static final int NumOfWorkingDays = 20;
    public static final int maxHourInMonth = 100;
    int employeeHrs = 0;
    int totalEmployeeHrs = 0;
    int totalWorkingDays = 0;

    public TotalWorkingDaysMonthConstructor(int employeeHrs, int totalEmployeeHrs, int totalWorkingDays) {
        this.employeeHrs = employeeHrs;
        this.totalEmployeeHrs = totalEmployeeHrs;
        this.totalWorkingDays = totalWorkingDays;
        while (totalEmployeeHrs <= maxHourInMonth && totalWorkingDays < NumOfWorkingDays) {
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
            System.out.println(" days: " + totalWorkingDays + "employee hr :" + employeeHrs);
        }

        int totalEmployeeWage = totalEmployeeHrs * employeeRatePerHour;

        System.out.println(totalEmployeeWage);

    }

    public static void main(String[] args) {
        TotalWorkingDaysMonthConstructor total = new TotalWorkingDaysMonthConstructor(0, 0, 0);

    }
}
