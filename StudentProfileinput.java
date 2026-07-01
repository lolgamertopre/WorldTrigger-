import java.util.Scanner;

// Reads first name, last name, and age from the user and prints a formatted message
public class StudentProfileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("My name is " + firstname + " " + lastname + ". I am " + age + " years old.");

        scanner.close();
    }
}