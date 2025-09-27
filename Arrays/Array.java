package Arrays;
public class Array{
  
    static int[] array2 = {10, 10, 20, 19 ,19, 30}; //Syntax2
    public static int[] getArray(){
        return array2;
    }
    public static void main(String[] args){
        // Arrays are mutable data structure
        // Arrays are fixed size data structure
        // Arrays are homogenous data structure
        // Arrays are linear data structure

        int[] array1 = new int[10]; //Syntax1
        int[] array2 = {10, 10, 20, 19 ,19, 30}; //Syntax2

        int[] arr; // Declaration, arr defined in the stack
        arr = new int[10]; //initialisation , actual object yet created in the heap memory
        System.out.println(array1+" "+array2+" "+arr);

        // String s = Arrays.toString(array2);
        // System.out.println(s);

        // int[] arr is declare at compile time
        // new int[10] initialisation is in runtime

        // continous memory allocation is in array
        // array obj are in heap
        // heap objects are not conitnous
        // Dynamic Memory Allocation
        // in Java array may not be conitnous memory allocaiton bcs of JVM

        //For integer type is array have not index value
        // arr[0] == 0 , arr[n-1] == 0 internaly

        //For the String array which have not assign index value
        // arr[0] == null, arr[n-1] == null internaly

        // null is assignable to non premitive data types
        

        //2d array
        int[][] arr2d = new int[3][4]; // 3 rows and 4 columns
        int [][] arr2d_2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        int[][] arr2d_1 = new int[3][]; // 3 rows and variable columns
        int[][] arr2d_3 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}   
        };

        for(int[] row : arr2d_2){
            for(int col : row){
                System.out.print(col + " ");
            }   
            System.out.println();
        }

    }
}