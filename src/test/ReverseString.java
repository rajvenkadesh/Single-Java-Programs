package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String inputString = "";

        System.out.println("Please enter the string to reverse it: ");
        inputString = scanner.nextLine();


        String res = reverseString(inputString);
        System.out.println("The reversed string is : " + res);
    }


    public static String reverseString(String inputString) {
        int inputStringLength = inputString.length();
        String res = "";
        for (int i = inputStringLength-1; i>=0; i--) {
            res = res + inputString.charAt(i);
        }
        return res;
    }
}
