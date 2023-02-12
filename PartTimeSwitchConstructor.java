package employeeWageOops;

public class PartTimeSwitchConstructor {
    static final   int isPartTime = 1;
    static final  int isFullTime = 2;
    static final int employeeRatePerHour = 20;
    int employeeHrs=0;
    int employeeWage=0;

    public PartTimeSwitchConstructor(int employeeHrs, int employeeWage) {
        this.employeeHrs = employeeHrs;
        this.employeeWage = employeeWage;
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

        employeeWage = employeeHrs * employeeRatePerHour;
       System.out.println(employeeWage);
    }

    public static void main(String[] args) {
        PartTimeSwitchConstructor partSwitch=new PartTimeSwitchConstructor(0,0);
    }
}
