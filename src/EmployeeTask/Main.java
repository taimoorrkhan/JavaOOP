package EmployeeTask;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
         HR_Manager hr_manager = new HR_Manager();
            employee.work();
            hr_manager.work();
            hr_manager.hire();
            System.out.println("Employee salary: " + employee.getSalary());
            System.out.println("HR Manager salary: " + hr_manager.getSalary());

    }
}
