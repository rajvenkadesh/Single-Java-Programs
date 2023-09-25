package arrayListPrograms;


import java.util.ArrayList;

/*
    ArrayList to Array: Convert an ArrayList of integers to an array of integers in Java.
 */
public class No12_ArrayList_Array {
    public static void main(String[] args) {
        //Create Arraylist
        ArrayList<Integer> list = new ArrayList<>();

        //Add elements to ArrayList
        list.add(123);
        list.add(45);
        list.add(23);
        list.add(786);
        list.add(67);

        //Method 1
        System.out.println("ArrayList to Array: ");
        int[] array = toArray(list);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        //Method 2
        System.out.println("ArrayList to Array Method2: ");
        Integer[] array2 = toArray2(list);
        for(int i=0; i<array2.length; i++)
            System.out.print(array2[i] + " ");
    }

    public static int[] toArray(ArrayList<Integer> list){
        int[] array = new int[list.size()];
        int i =0;
        for(Integer x : list){
            array[i++] = x.intValue();
        }
        return array;
    }

    public static Integer[] toArray2(ArrayList<Integer> list){
        //Integer[] array = new Integer[list.size()];
        Integer[] array = list.toArray(new Integer[list.size()]);
        return array;
    }
}
