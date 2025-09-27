package Arrays.Searching;
import Arrays.Array;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public int firstOccurance(int[] arr, int target){
        int left = 0, right = arr.length-1;
        int ans = -1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                ans = mid;
                right = mid - 1; // Look on left side for first occurance
            }
            else if(arr[mid] > target){
                right = mid = -1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans; 
    }

    public int lastOcc(int[] arr, int target){
        int left = 0, right = arr.length-1;
        int ans = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                ans = mid;
                left = mid + 1; // Look on right side for last occurance
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
    
    public int lowerBound(int[] arr, int target){
        int i=0, j=arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;

            if(arr[mid]>=target){
                ans = mid;
                j = mid;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
    public int upperBound(int[] arr, int target){
        int i=0, j=arr.length-1;
        int ans = -1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(arr[mid]>target){
                ans = mid;
                j = mid;
            }else{
                i = mid + 1;
            }
        } 
        return ans;
    }

    public int binarySearchDesc(int[] arr, int target){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
           if(arr[mid]==target){
                return mid;
           }else if(arr[mid]>target){
               i=mid+1;
           }else{
              j=mid-1;
           }
        }
        return -1;
    }

    public int bsOnAnswers(int x){
        //sq of x
        int left = 0, right = x;
        int ans = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            long sq = (long) mid * mid;
            if(sq == mid) return mid;
            else if(sq<mid) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }

    public int BsOnRoatedArray(int[] arr, int target){
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[left]<arr[mid]){
              //left part is sorted
              if(arr[left]<=target && target<=arr[mid]){
                  right = mid-1;
              }else{
                  left = mid + 1;
              }
            }else{
                //right part is sorted
                if(arr[mid]<=target && target<=arr[right]){
                     left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }


    public static int infiniteArraySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int solution(int[] arr, int target) {
     int start = 0;
     int end = 1;

     while(target > arr[end]) {
         int newStart = end+1;
         end = end + (end-start+1) * 2;
         start = newStart;
     }
     return infiniteArraySearch(arr, target, start, end);
    }
   
    public static int ternarySearch(int arr[], int target){
        int left = 0, right = arr.length-1;

        while(left<=right){
            int mid1 = left + (right-left)/3;
            int mid2 = right - (right-left)/3;

            if(arr[mid1]==target){
                return mid1;
            }
            if(arr[mid2]==target){
                return mid2;
            }
            if(arr[mid1]>target){
                right = mid1-1;
            }else if(arr[mid2]<target){
                left = mid2+1;
            }else{
                left = mid1 + 1;
                right = mid2 -1;
            }
        }
        return -1;
    }

    
    public static int[] binarySearch2d(int[][] matrix, int target) {
         int row = matrix.length;
         int col = matrix[0].length;
         int left = 0;
         int right = col-1;

         while(left<row && right>=0){
            if(matrix[left][right] == target){
                return new int[]{left, right};
            }
            else if(matrix[left][right] < target){
                 left++;
            }
            else{
                right--;
            }
         }

         return new int[]{-1, -1}; // Target not found
    }

    static int[] binary2d(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid]==target){
                return new int[]{row, mid};
            }else if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] Search2dMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1){
            return binary2d(matrix, row, 0, col-1, target);
        }
        
        int rStart = 0;
        int rEnd = row - 1;
        int cmid = col/2;

        while(rStart < (rEnd-1)) {
           int mid = rStart + (rEnd - rStart) / 2;
           if(matrix[mid][cmid] == target) {
               return new int[]{mid, cmid};
           }
           if(matrix[mid][cmid] < target) {
               rStart = mid;
           } else {
               rEnd = mid;
           }

        }
        
        if(matrix[rStart][cmid] == target) {
            return new int[]{rStart, cmid};
        }
        if(matrix[rStart+1][cmid] == target) {
            return new int[]{rStart+1, cmid};
        } 
        if(target <= matrix[rStart][cmid-1]) {
            return binary2d(matrix, rStart, 0, cmid-1, target);
        }
        if(target >= matrix[rStart][cmid+1]) {
            return binary2d(matrix, rStart, cmid+1, col-1, target);
        }
        if(target <= matrix[rStart+1][cmid-1]) {
            return binary2d(matrix, rStart+1, 0, cmid-1, target);
        }
        if(target >= matrix[rStart+1][cmid+1]) {
            return binary2d(matrix, rStart+1, cmid+1, col-1, target);
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 100, 200, 400}; // Sorted array for binary search
        int[][] matrix = {
            {10, 20, 30, 40, 45},
            {50, 100, 200, 400, 450},
            {500, 1000, 2000, 4000, 4500},
            {5000, 10000, 20000, 40000, 45000}
        };

        int target = 2000;
        int[] result = binarySearch2d(matrix, target);

        if (result[0] != -1) {
            System.out.println("Target found at index: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Target not found.");
        }
    }
}

