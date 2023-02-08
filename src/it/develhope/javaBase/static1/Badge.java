package it.develhope.javaBase.static1;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    Random random = new Random();

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        char ch1 = (char) random.nextInt(33, 125);
        char ch2 = (char) random.nextInt(33, 125);
        char ch3 = (char) random.nextInt(33, 125);
        char ch4 = (char) random.nextInt(33, 125);
        char ch5 = (char) random.nextInt(33, 125);
        char ch6 = (char) random.nextInt(33, 125);
        return ch1 + ch2 + ch3 + employee.name + employee.surname + ch4 + ch5 + ch6;
    }
    public void showBadgeDetails(){
        System.out.println("There are currently "+ totalNumberOfEmployees +" employees");
        System.out.println(employee.getEmployeeDetails());
        System.out.println("Id code = "+badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}
