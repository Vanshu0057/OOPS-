class Employee {
    private String employeeName;
    private double salary;
    private static int employeeCount = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    void displayDetails() {
        System.out.println("Employee: " + employeeName);
        System.out.printf("Salary: $%.2f%n", salary);
    }

    static void displayEmployeeCount() {
        System.out.println("Total employees created: " + employeeCount);
    }
}

public class Pritacal9 {
    public static void main(String[] args) {
        Employee first = new Employee();
        Employee second = new Employee("Maya", 52000);
        Employee third = new Employee("Noah", 61000);

        System.out.println("Employee details:");
        first.displayDetails();
        second.displayDetails();
        third.displayDetails();

        System.out.println();
        Employee.displayEmployeeCount();
    }
}