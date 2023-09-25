package test;

        import java.util.InputMismatchException;
        import java.util.Scanner;

public class isNumberPrimeImprovedVersion {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = 0;

        while (true) {
            try {
                System.out.println("Please enter an integer number: ");
                inputNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        boolean isPrime = isPrimeNumber(inputNumber);
        if (isPrime)
            System.out.println("The given number is a prime number.");
        else
            System.out.println("The given number is not a prime number");
    }

    public static boolean isPrimeNumber(int num) {
        if (num < 2)
            return false;

        double sqrt = Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

