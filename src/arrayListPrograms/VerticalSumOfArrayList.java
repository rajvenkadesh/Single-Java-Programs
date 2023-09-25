package arrayListPrograms;

import java.util.ArrayList;

public class VerticalSumOfArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayListOfArrayList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        arrayListOfArrayList.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(2);
        row2.add(1);
        arrayListOfArrayList.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(2);
        row3.add(2);
        arrayListOfArrayList.add(row3);

        System.out.println(arrayListOfArrayList);
        int maxArraySize = maxInnerArrayListSize(arrayListOfArrayList);
        System.out.println(maxArraySize);

        int[]  verticalSum =  new int[maxArraySize];

        for(ArrayList<Integer> row : arrayListOfArrayList){
            for(int i=0; i<row.size(); i++){
                verticalSum[i] += row.get(i);
            }
        }

        int minVerticalSum = verticalSum[0];

        for(int i=0; i<verticalSum.length; i++){
            minVerticalSum = Math.min(minVerticalSum, verticalSum[i]);
        }

        System.out.println("The minimum vertical sum of the ArrayList of ArrayList: " + minVerticalSum);
    }


    public static int maxInnerArrayListSize(ArrayList<ArrayList<Integer>> arrayListOfArrayList){
        int maxInnerSize = 0;
        for(ArrayList<Integer> row: arrayListOfArrayList){
            maxInnerSize = Math.max(maxInnerSize, row.size());
        }
        return maxInnerSize;
    }
}
