package employeeWageOops;

public class EmployeePresentOrAbsentUsingSetterAndGetter {
     int fullTime = 1;
     int employeeAttendence;

    public EmployeePresentOrAbsentUsingSetterAndGetter( int employeeAttendence) {// using constructor
        this.employeeAttendence = employeeAttendence;

        double employeeCheck = Math.floor(Math.random() * 20) % 2;
        if (employeeCheck == fullTime) {
            System.out.println("present");
        } else {
            System.out.println("absent");
        }

    }

    public static void main(String[] args) {
        EmployeePresentOrAbsentUsingSetterAndGetter construct=new EmployeePresentOrAbsentUsingSetterAndGetter(1);
        System.out.println(  construct.employeeAttendence);
    }
}


