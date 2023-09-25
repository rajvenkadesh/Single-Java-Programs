package arrayListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
    ArrayList Searching: Implement a function that searches for a specific element in an ArrayList
    and returns its index. Handle cases when the element is not found.
 */
public class No5_ArrayList_Searching {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me the size of the arraylist: ");
        int n = sc.nextInt();

        //Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(n);

        //Add elements to array list
        System.out.println("Please enter the elements of the array list: ");
        for(int i=0; i<n; i++){
            int element = sc.nextInt();
            numbers.add(Integer.valueOf(element));
            //numbers.add(element);
        }

        //Get the element to be searched
        System.out.println("Please enter the element to be searched: ");
        Integer searchElement = sc.nextInt();

        //int index = searchArrayList(numbers, searchElement);
        int index = searchArrayList2(numbers, searchElement);
        if(index == -1)
            System.out.println("The given search element is not available in the arraylist.");
        else
            System.out.println("The given search element in the index: " + index);


    }

    public static int searchArrayList(ArrayList<Integer> numbers, Integer searchElement){
        return numbers.indexOf(searchElement);
    }

    public static int searchArrayList2(ArrayList<Integer> numbers, Integer searchElement){
        for(int i=0; i<numbers.size();i++){
            if(numbers.get(i).equals(searchElement))
                return i;
        }
        return -1;
    }
}
