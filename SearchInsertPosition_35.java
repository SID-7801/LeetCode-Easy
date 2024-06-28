public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7};
        int target = 6;
        SearchInsertPosition_35 sp = new SearchInsertPosition_35();
        int ans = sp.index(arr,target);
        System.out.println(ans);
    }

    public int index(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid ]== target){
                return mid;
            }
            if (arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}



//Given a sorted array of distinct integers and a target value,
// return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
