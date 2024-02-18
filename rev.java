import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }
        long reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static long reverseDigits(long number) {
        long reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}