package arrayPrograms;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        //int[] arr = {10, 12, 11, 8, 13, 8, 9, 12, 19, 17};
        //int[] arr = {1};
        int[] arr = {10, 10, 10, 10, 10};
        //int[] arr = {10, 10, 10, 11, 11, 11};
        //int[] arr = {};
        int secondLargest;

        secondLargest = secondLargestElementArray(arr);
        System.out.println(secondLargest);

    }

    public static int secondLargestElementArray(int[] arr){

        if(arr == null || arr.length < 2)
            throw new IllegalArgumentException("The given array is either null or length is less than 2.");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }

        if(secondLargest == Integer.MIN_VALUE)
            throw new IllegalArgumentException("There is no second largest element in the given array.");

        return secondLargest;
    }
}
