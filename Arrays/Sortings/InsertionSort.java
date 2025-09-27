package Arrays.Sortings;

public class InsertionSort { 
    public static void Ist(int[] arr){
         int len = arr.length;
         for(int i=0; i<len; i++){
           int val = arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>val){
            arr[j+1] = arr[j];
            j--;
           }
            arr[j+1] = val;
         }
    }
    public static void visualizer(int[] arr, int start, int end){
        for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        visualizer(arr, 0, arr.length - 1);
        Ist(arr);
        System.out.println("Sorted array:");
        visualizer(arr, 0, arr.length - 1);
    }
}
