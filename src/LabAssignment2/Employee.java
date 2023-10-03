package LabAssignment2;

public class Employee {

     private final int id;
     private final String name;

    // Parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
         Employee obj1 = new Employee(1, "John Doe");

        // Creating the second Employee object (obj2) with constructor arguments
        Employee obj2 = new Employee(2, "Jane Smith");

        // Displaying information for obj1 and obj2
        System.out.println("Employee Information for obj1:");
        obj1.displayInfo();

        System.out.println("\nEmployee Information for obj2:");
        obj2.displayInfo();
    }
    
}
