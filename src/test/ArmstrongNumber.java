package test;

import java.util.Scanner;

/*
An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or pluperfect number)
is a number that is equal to the sum of its own digits each raised to the power of the number of digits in the number.
In other words, an n-digit number is an Armstrong number if the sum of its digits,
each raised to the power of n, is equal to the number itself.

For example, let's consider the number 153:

1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lower bound number: ");
        int lowerBound = scanner.nextInt();
        System.out.println("Please enter the upper bound number: ");
        int upperBound = scanner.nextInt();

        for(int num = lowerBound; num <= upperBound; num++){
            if(isArmstrongNumber(num))
                System.out.println(num + " ");
        }
    }

    public static int countDigits(int num){
        int count = 0;
        while(num > 0){
            num = num / 10;
            count++;
        }
        //System.out.println("Count is: " + count);
        return count;
    }

    public static boolean isArmstrongNumber(int num){
        int count = countDigits(num);
        int originalNum = num;
        double sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + Math.pow(digit,count);
            num = num / 10;
        }
        return originalNum == sum;
    }
}
