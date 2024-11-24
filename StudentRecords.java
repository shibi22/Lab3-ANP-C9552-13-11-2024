import java.util.Scanner;

// Student class to store student details
class Student {
    String name;
    int age;
    int rollNumber;

    // Constructor to initialize Student object
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber);
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 10 Student objects
        Student[] students = new Student[10];

        try {
            // Taking input for 10 students
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter details for student " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Roll Number: ");
                int rollNumber = scanner.nextInt();

                // Storing the student in the array
                students[i] = new Student(name, age, rollNumber);
            }

            // Display all student records
            System.out.println("\nStored Student Records:");
            for (int i = 0; i < 10; i++) {
                students[i].display();
            }

            // Attempting to access an out-of-bounds index
            System.out.println("\nAttempting to access an out-of-bounds index:");
            students[10].display();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index outside the array bounds!");
        } 
    }
}
