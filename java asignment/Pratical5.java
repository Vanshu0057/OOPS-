class ComplexNumber {
    private final double real;
    private final double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
                this.real + other.real,
                this.imaginary + other.imaginary);
    }

    void display() {
        if (imaginary < 0) {
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}

public class Pratical5 {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4, 3);
        ComplexNumber second = new ComplexNumber(2, 5);
        ComplexNumber sum = first.add(second);

        System.out.print("First complex number: ");
        first.display();
        System.out.print("Second complex number: ");
        second.display();
        System.out.print("Sum: ");
        sum.display();
    }
}