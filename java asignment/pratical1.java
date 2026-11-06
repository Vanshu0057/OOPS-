class Student {
    int rollNumber;
    String name;
    double subject1Marks;
    double subject2Marks;
    double subject3Marks;

    Student(int rollNumber, String name, double subject1Marks,
            double subject2Marks, double subject3Marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    double calculateTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    double calculatePercentage() {
        return calculateTotalMarks() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + subject1Marks + ", "
                + subject2Marks + ", " + subject3Marks);
        System.out.println("Total Marks: " + calculateTotalMarks() + " / 300");
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.println();
    }
}

public class pratical1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Aarav", 85, 90, 88);
        Student student2 = new Student(2, "Diya", 92, 81, 95);
        Student student3 = new Student(3, "Kabir", 76, 84, 79);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}