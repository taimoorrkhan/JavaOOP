package LabAssignment2;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length = 1.0;
        breadth = 1.0;
    }
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = 1.0;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        Rectangle rectangle3 = new Rectangle(4.0);

        System.out.println("Area of rectangle1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle2: " + rectangle2.calculateArea());
        System.out.println("Area of rectangle3: " + rectangle3.calculateArea());
    }
}