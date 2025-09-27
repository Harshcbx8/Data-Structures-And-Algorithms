package Arrays.Sortings;

public class CyclicSort {
    public static void sort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctIdx = arr[i] - 1;
            if(arr[i]!=arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            }else{
                i++;
            }
        }
    }
    public static void displayArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        displayArray(arr);
    }


}
