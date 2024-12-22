import java.util.Scanner;

public class SumLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3.0;

        // Display results
        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the largest number is: " + largest);
        System.out.println("The average of the three numbers is: " + average);
    }
}