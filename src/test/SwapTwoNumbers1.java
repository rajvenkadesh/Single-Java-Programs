package test;


/*Program to Swap Two Numbers:
   Write a program to swap the values of two variables by using a third variable.
*/
public class SwapTwoNumbers1 {
    public static void main(String args[]){
        int a = 23;
        int b = 54;
        int c;
        System.out.println("Before swap: ");
        System.out.println(a + " " + b);

        c = b;
        b = a;
        a = c;

        System.out.println("After swap: ");
        System.out.println(a + " " + b);
    }
}
