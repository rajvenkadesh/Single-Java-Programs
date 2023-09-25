package test;

import java.util.Scanner;

public class ReverseStringBuiltInMethod {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to reverse it: ");
        String inputString = scanner.nextLine();

        String res = reverseString(inputString);
        System.out.println("The reverse string is: " + res);

    }

    public static String reverseString(String inputString){
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
