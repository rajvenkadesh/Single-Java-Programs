package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialProgramWithExceptionHandling {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number to find the factorial");

        try {
            int a = scanner.nextInt();
            int res = 1;
            for (int i = a; i > 0; i--) {
                res = res * i;
            }
            System.out.println("Factorial of number " + a + ": " + res);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter an Integer.");
        } finally {
            scanner.close();
        }
    }
}
