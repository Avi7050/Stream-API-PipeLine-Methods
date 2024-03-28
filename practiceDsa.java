import java.util.Arrays;

public class practiceDsa {
    public static void main(String[] args) {
        // int[] arr = {2,3,5,9,14,16,18};
        // int target = 15;
        // int ceiling = ceiling(arr, target);
        // System.out.println(ceiling);
        // int floor = floor(arr, target);
        // System.out.println(floor);

        // int[] arr1 = {2,3,4,7,7,7,7,7,8,9};
        // int target1 = 7;
        // int[] ans = searchInRange(arr1, target1);
        // System.out.println(Arrays.toString(ans));

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target2 = 6;
        int[] ans = twoSum(nums, target2);
        System.out.println(Arrays.toString(ans));
    
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
         for(int i = 0; i < nums.length; i++){
             for(int j = i + 1; j < nums.length - 1; j++){
                 if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                 }
             } 
         }
         return ans;
     }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
           if(target == arr[mid]){
           return arr[mid];
           }else if(target < arr[mid]){
            end = mid - 1;
           }else if(target > arr[mid]){
            start = mid + 1;
           }
        }
        return arr[start % arr.length];
    } 

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return arr[mid];
            }else if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[end % arr.length];
    }
    static int searchFirstIndex(int[] arr1, int target1, boolean firstOccurence){
        int start = 0;
        int end = arr1.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target1 < arr1[mid]){
               end = mid - 1;
            }else if (target1 > arr1[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(firstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    static int[] searchInRange(int[] arr1, int target){
        int[] ans = {-1,-1};
        ans[0] = searchFirstIndex(arr1, target, true);
        ans[1] = searchFirstIndex(arr1, target, false);
        return ans;
    }
    
}
