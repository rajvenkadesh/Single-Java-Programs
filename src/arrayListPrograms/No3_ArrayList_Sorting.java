package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;


/*
    ArrayList Sorting: Write a Java program to sort an ArrayList of strings
    in ascending order using the Collections.sort() method.
 */
public class No3_ArrayList_Sorting {
    public static void main(String[] args) {
        //Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("Varathappan");
        names.add("Poongodi");
        names.add("Venkadesh");
        names.add("Kanya");
        names.add("Yogamithran");
        names.add("Kaniyan Poongundran");

        //Print the ArrayList before Sorting
        System.out.println("Before Sorting");
        System.out.println(names);

        //Sorting the ArrayList
        Collections.sort(names);

        //Print the ArrayList after Sorting
        System.out.println("After Sorting \n--------------");
        //System.out.println(names);
        for(String name : names){
            System.out.println(name);
        }
    }
}
