package test;

import java.util.Scanner;

public class ReverseStringImprovedVersion {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string to reverse it: ");
        String inputString = scanner.nextLine();
        String res = reverseString(inputString);
        System.out.println("The reverse string is: " + res);
    }

    public static String reverseString(String inputString){
        char[] charArray = inputString.toCharArray();
        int start = 0;
        int end = inputString.length() - 1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}