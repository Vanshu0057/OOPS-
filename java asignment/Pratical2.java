class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void drive() {
        System.out.println(brand + " " + model + " is driving.");
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void showEmployeeDetails() {
        introduce();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void manageTeam() {
        showEmployeeDetails();
        System.out.println("Department: " + department);
        System.out.println(name + " is managing the team.");
    }
}

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Pratical2 {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Car car = new Car("Toyota", "Corolla");
        car.start();
        car.drive();

        System.out.println("\n=== Multilevel Inheritance ===");
        Manager manager = new Manager("Asha", 101, "Sales");
        manager.manageTeam();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Circle circle = new Circle("Blue", 3);
        circle.showColor();
        System.out.printf("Circle area: %.2f%n", circle.calculateArea());

        Rectangle rectangle = new Rectangle("Green", 4, 5);
        rectangle.showColor();
        System.out.printf("Rectangle area: %.2f%n", rectangle.calculateArea());
    }
}