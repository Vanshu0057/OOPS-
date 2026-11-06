class Calculator {
    int add(int number1, int number2) {
        return number1 + number2;
    }

    int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    double add(double number1, double number2) {
        return number1 + number2;
    }
}

class Employee {
    String name;
    double basePay;

    Employee(String name, double basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    double calculatePay() {
        return basePay;
    }
}

class SalariedEmployee extends Employee {
    double bonus;

    SalariedEmployee(String name, double basePay, double bonus) {
        super(name, basePay);
        this.bonus = bonus;
    }

    @Override
    double calculatePay() {
        return basePay + bonus;
    }
}

class CommissionEmployee extends Employee {
    double sales;
    double commissionRate;

    CommissionEmployee(String name, double basePay, double sales, double commissionRate) {
        super(name, basePay);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    double calculatePay() {
        return basePay + sales * commissionRate;
    }
}

public class Pratical4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Method Overloading ===");
        System.out.println("add(10, 20) = " + calculator.add(10, 20));
        System.out.println("add(10, 20, 30) = " + calculator.add(10, 20, 30));
        System.out.println("add(2.5, 3.7) = " + calculator.add(2.5, 3.7));

        System.out.println("\n=== Method Overriding ===");
        Employee employee = new SalariedEmployee("Asha", 3000, 500);
        System.out.printf("%s's pay: $%.2f%n", employee.name, employee.calculatePay());

        employee = new CommissionEmployee("Ravi", 2000, 10000, 0.10);
        System.out.printf("%s's pay: $%.2f%n", employee.name, employee.calculatePay());
    }
}