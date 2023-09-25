package arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

/*
    ArrayList Filtering: Create a program that filters out even numbers
    from an ArrayList of integers and stores them in a new ArrayList.
 */
public class No4_ArrayList_Filtering {
    public static void main(String[] args) {
        //Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        //Add elements to the arraylist
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);

        //filtering only even numbers and storing in a new arraylist
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(Integer x : numbers){
            if(x%2 == 0)
                evenNumbers.add(x);
        }

        //Printing even numbers arraylist
        System.out.println("Printing even numbers array list: ");
        Iterator it = evenNumbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
