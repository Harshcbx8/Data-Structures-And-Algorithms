package Arrays.Sortings;
public class SelectionSort{
    public static void visualizer(int[] arr, int start, int end){
        for(int i=0; i<arr.length; i++){
            if(i==start){
                System.out.print("["+arr[i]+"] "); // Highlight the current elements being compared
            }
            else if(i==end){
                System.out.print("["+arr[i]+"] ");
            }
            else{
                System.out.print(arr[i]+"  ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {9,8,3,8,2,49,7,2,35,47,2,3};
        
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                
                System.out.print("--Before: ");
                visualizer(arr, j, min);
                if(arr[j]<arr[min]){
                    System.out.print("|-- ["+arr[min]+"] > ["+arr[j]+"] NEW MIN: "+arr[j]+" --|  ");
                    min = j;
                }
                System.out.print("---Comparing:  ");
                visualizer(arr, j, min);
                System.out.println();
            }
            
            System.out.print("--Swapping: ");
            visualizer(arr, i, min);
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.print("--After Swap: ");
            visualizer(arr, i, min);
            System.out.println();
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}