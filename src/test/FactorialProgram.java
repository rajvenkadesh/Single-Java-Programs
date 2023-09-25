package test;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the integer number to find the factorial");
        int a = scanner.nextInt();
        int res = 1;
        for(int i=a; i>0; i--){
            res = res * i;
        }
        System.out.println("Factorial of number " + a + ": " + res);
        scanner.close();
    }
}
