package arrayListPrograms;

import java.util.ArrayList;
import java.util.HashSet;

/*
    ArrayList Union: Write a Java program to find the union of two ArrayLists of integers
     (combine elements from both lists without duplicates).
 */
public class No11_ArrayList_Union {
    public static void main(String[] args) {
        //Create two arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(23);
        list2.add(23);
        list1.add(34);
        list2.add(34);
        list2.add(45);
        list2.add(33);
        list1.add(67);
        list2.add(78);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        HashSet<Integer> result = new HashSet<>(list1);
        result.addAll(list2);

        System.out.println("Union of two lists: " + result);

    }
}
