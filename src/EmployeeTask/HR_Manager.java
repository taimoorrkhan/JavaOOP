package EmployeeTask;

public class HR_Manager extends Employee{
    public void work() {
        System.out.println("HR Manager is working");
    }

    public double getSalary() {
        // example salary  : 2000.0
        return 1000.0;
    }

    public void hire() {
        System.out.println("HR Manager is hiring");
    }
}
