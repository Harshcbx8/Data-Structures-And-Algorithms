package Arrays.Searching;
import Arrays.Array;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Target found, return index
            }
        }
        return -1; // Target not found
    }

    public static int firstOccurance(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurance1(int[] arr, int target){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int lastOccurance2(int[] arr, int target){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                ans = i;
            }
        }
        return ans;
    }

    public static int recursiveLinearSearch(int[] arr, int target, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return recursiveLinearSearch(arr, target, idx+1);
    }

    public static int sentinelLinearSearch(int[] arr, int target){
        int n = arr.length;
        int last = arr[n-1];
        arr[n-1] = target;
        int i=0;
        while(arr[i]!=target) i++;
        arr[n-1] = last;
        if(i<n-1 || arr[n-1]==target) return i;
        return -1;
    }

    public static void main(String[] args) {
    
        // int target = 30;
        // int[] array = Array.getArray();
        // int result = linearSearch(array, target);
        // if (result != -1) {
        //     System.out.println("Target found at index: " + result);
        // } else {
        //     System.out.println("Target not found.");
        // }


        // int[] array2 = {1, 3, 4, 4, 5, 5, 5, 6, 8, 10};;
        // int result2 = firstOccurance(array2, 5);
        // if (result2 != -1) {
        //     System.out.println("First occurrence found at index: " + result2);
        // } else {
        //     System.out.println("First occurrence not found.");
        // }

        // int[] array3 = {1, 3, 4, 4, 5, 5, 5, 6, 8, 10};
        // int result3 = lastOccurance2(array3, 5);        
        // if (result3 != -1) {
        //     System.out.println("Last occurrence found at index: " + result3);
        // }
        // else {
        //     System.out.println("Last occurrence not found.");
        // }

        // int[] array4 = {1, 3, 4, 4, 5, 5, 5, 6, 8, 10};         
        // int result4 = recursiveLinearSearch(array4, 5, 0);
        // if (result4 != -1) {
        //     System.out.println("Target found at index: " + result4);
        // } else {
        //     System.out.println("Target not found.");
        // }

        int[] array5 = {1, 3, 4, 4, 5, 5, 5, 6, 8, 10};

        int result5 = sentinelLinearSearch(array5, 5);
        if (result5 != -1) {
            System.out.println("Target found at index: " + result5);            
        } else {
            System.out.println("Target not found.");            
        }

    }
}
