package Arrays.Sortings;

public class BubbleSort {
    public static void visualizer(int[] arr, int start, int end){
        for(int i=0; i<arr.length; i++){
            if(i==start){
                System.out.print("["+arr[i]+" "); // Highlight the current elements being compared
            }
            else if(i==end){
                System.out.print(arr[i]+"] ");
            }
            else{
                System.out.print(arr[i]+"  ");
            }
        }
    }
    public static void bubbleSort(int[] arr) {
      int len = arr.length;

      for(int i=0; i<len; i++){
        boolean swapped = false; // To optimize and stop if no swaps are made
        for(int j=0; j<len-i-1; j++){
            visualizer(arr, j, j+1);
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
            
            System.out.print("--After Swaping-->  ");
            visualizer(arr, j, j+1);
            System.out.println();
        }
        if(!swapped) break; // If no elements were swapped, the array is sorted
      }

    }
    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("Unsorted array:");
        displayArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array:");
        displayArray(arr);
    }
   
}
