public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {9,8,3,8,2,49,7,2,35,47,2,3};
        
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}