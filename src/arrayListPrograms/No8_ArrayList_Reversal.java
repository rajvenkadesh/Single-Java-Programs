package arrayListPrograms;

import java.util.ArrayList;


/*
    ArrayList Reversal: Implement a function to reverse the elements of an ArrayList
    without using any built-in Java methods or additional data structures.
 */
public class No8_ArrayList_Reversal {
    public static void main(String[] args) {
        //Create Arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements to ArrayList
        list.add(123);
        list.add(45);
        list.add(23);
        list.add(786);
        list.add(67);

        //reverse the arraylist
        System.out.println(reverse(list));
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        int start = 0;
        int end = list.size()-1;

        while(start < end){
            Integer temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

        return list;
    }
}
