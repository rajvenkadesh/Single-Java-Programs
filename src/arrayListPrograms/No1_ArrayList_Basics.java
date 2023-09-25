package arrayListPrograms;

/*
    ArrayList Basics: Write Java code to create an ArrayList of integers,
    add elements to it, and print the elements.
 */

import java.util.ArrayList;

public class No1_ArrayList_Basics {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the ArrayList
        al.add(10234);
        al.add(25678);
        al.add(76523);
        al.add(9654);
        al.add(689543);

        // Print the elements of the ArrayList
        printArrayList1(al);
        printArrayList2(al);
        printArrayList3(al);
        printArrayList4(al);

    }
    
    public static void printArrayList1(ArrayList<Integer> al){
        System.out.println(al);
    }
    
    public static void printArrayList2(ArrayList<Integer> al){
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
    }

    public static void printArrayList3(ArrayList<Integer> al){
        for(Integer x : al){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void printArrayList4(ArrayList<Integer> al){
        al.forEach( x -> System.out.print( x + " "));
        System.out.println();
    }
    
}
