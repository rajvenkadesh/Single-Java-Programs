package arrayListPrograms;


import java.util.ArrayList;
import java.util.Iterator;

/*
    ArrayList Operations: Implement a program to add, remove, and retrieve elements from an ArrayList.
    Handle edge cases like index out of bounds and demonstrate error handling.
 */
public class No2_ArrayList_Operations {
    public static void main(String[] args) {
        //Create an ArrayList of Double numbers
        ArrayList<Double> numbers = new ArrayList<>();

        //Add Elements to the arrayList
        numbers.add(799.99);
        numbers.add(699.79);
        numbers.add(1099.11);
        numbers.add(1249.1234568);

        //Print the elements of the array list
        printArrayList1(numbers);

        //remove the element from the array list
        System.out.println("We are removing 2nd element from the array list: " + numbers.remove(1));

        //Print the elements of the array list after removing 2nd elements from the list.
        printArrayList1(numbers);

        int removeIndex = 3;
        if(removeIndex >=0 && removeIndex < numbers.size()){
            System.out.println("We are removing " + removeIndex + "nd element and element is: " + numbers.remove(removeIndex));
        }else {
            System.out.println("You have given the wrong index.");
        }

        //Handle edge cases like index out of bounds and demonstrate error handling
        try{
            numbers.get(10);
        }catch(IndexOutOfBoundsException e){
            System.out.println("You are trying to remove element from the wrong index.");

        }



    }

    public static void printArrayList1(ArrayList<Double> numbers){
        Iterator it = numbers.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
