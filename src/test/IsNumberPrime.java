package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String args[]){

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an integer number: ");
            int number = scanner.nextInt();
            boolean isPrime = isPrimeNumber(number);
            if (isPrime)
                System.out.println("The given number is a prime number.");
            else
                System.out.println("The given number is not a prime number");
        }catch (InputMismatchException e){
            System.out.println("The given input is wrong. Please enter the integer number.");
        }
    }

    public static boolean isPrimeNumber(int number){
        if(number <2)
            return false;

        for(int i=2; i<Math.sqrt(number)+1; i++){
            if(number % i == 0)
                return false;
        }

        return true;
    }
}
