package arrayListPrograms;

import java.util.ArrayList;

/*
    ArrayList Duplication Removal: Write a Java program to remove duplicate elements
     from an ArrayList while preserving the order of the original elements.
 */
public class No6_ArrayList_Duplicates_Removal {
    public static void main(String[] args) {
        //Create a new arraylist
        ArrayList<Integer> numbers = new ArrayList<>();

        //Add elements to the arraylist
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(123);
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(123);
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(123);

        //print arraylist:
        System.out.println(numbers);

        System.out.println();

        ArrayList<Integer> result = removeDuplicate(numbers);

        System.out.println("Array without duplicates: \n" + result);


    }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> numbers){
        for(int i=0; i<numbers.size(); i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i).equals(numbers.get(j))){
                    numbers.remove(j);
                    j--;
                    System.out.println(numbers);
                }
            }
        }
        return numbers;
    }
}
