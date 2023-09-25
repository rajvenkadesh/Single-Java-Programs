package arrayPrograms;

public class FindLargestElementInArray {
    public static void main(String[] args) {
         int[] arr = {5, 6, 0, 2, 3, 7, 1};
         int largest = findLargest1(arr);
         System.out.println(largest);

         largest = findLargest2(arr);
         System.out.println(largest);

         largest = findLargest3(arr);
         System.out.println(largest);
    }

    public static int findLargest1(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i])
                largest = arr[i];
        }
        return largest;
    }

    public static int findLargest2(int[] arr){
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest < arr[i])
                largest = arr[i];
        }
        return largest;
    }

    public static int findLargest3(int[] arr){
        int largest = 0;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i])
                largest = arr[i];
        }
        return largest;
    }
}
