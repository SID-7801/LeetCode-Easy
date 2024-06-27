import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElements_27 r = new RemoveElements_27();
        int fi= r.removeElement(nums,val);
        System.out.println(fi);
    }


    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
