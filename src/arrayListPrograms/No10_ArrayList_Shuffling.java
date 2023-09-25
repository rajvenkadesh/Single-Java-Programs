package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;


/*
    ArrayList Shuffling: Create a program that shuffles the elements of an ArrayList
    to randomize their order. Use the Collections.shuffle() method.
 */
public class No10_ArrayList_Shuffling {
    public static void main(String[] args) {
        //Create Arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //Add element to arraylist
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(11);
        list.add(345);
        list.add(56);
        list.add(78);
        list.add(47);

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
