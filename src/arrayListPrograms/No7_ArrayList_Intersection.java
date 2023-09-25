package arrayListPrograms;

import java.util.ArrayList;
import java.util.HashSet;

/*
    ArrayList Intersection: Create a program that finds the intersection of two ArrayLists of integers,
    i.e., elements that are common in both lists.
 */
public class No7_ArrayList_Intersection {
    public static void main(String[] args) {
        //Create two arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        //add elements to arraylists
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        
        list2.add(5);
        list2.add(10);
        list2.add(15);
        list2.add(20);
        
        HashSet<Integer> result = intersection(list1, list2);
        System.out.println(result);

        ArrayList<Integer> result2 = intersection1(list1, list2);
        System.out.println(result2);

    }
    
    public static HashSet<Integer> intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){
        HashSet<Integer> result = new HashSet<>();
        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i).equals(list2.get(j)))
                    result.add(list1.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Integer> intersection1(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer x : list1){
            if(list2.contains(x))
                result.add(x);
        }
        return result;
    }
}
