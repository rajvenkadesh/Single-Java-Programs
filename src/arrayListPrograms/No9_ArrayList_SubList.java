package arrayListPrograms;


import java.util.ArrayList;
import java.util.List;

/*
    ArrayList Sublist: Write Java code to extract a sublist
    from an ArrayList based on a given range of indices.
 */
public class No9_ArrayList_SubList {
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

        ArrayList<Integer> result = subList(list, 3, 6);
        System.out.println(result);

        List<Integer> result2 = subList2(list, 0, 8);
        System.out.println(result2);

    }

    public static ArrayList<Integer> subList(ArrayList<Integer> list, int startIndex, int endIndex){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=startIndex; i<=endIndex; i++){
            result.add(list.get(i));
        }
        return result;
    }

    public static List<Integer> subList2(ArrayList<Integer> list, int startIndex, int endIndex){
        if(startIndex < 0 || endIndex > list.size() || startIndex > endIndex)
            throw new IllegalArgumentException("Invalid start or end index.");

        return list.subList(startIndex, endIndex);
    }
}
