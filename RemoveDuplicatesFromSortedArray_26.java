import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5};
        RemoveDuplicatesFromSortedArray_26 remove = new RemoveDuplicatesFromSortedArray_26();
        int length = remove.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + length);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums){
//        Set<Integer> uniqueElements = new HashSet<>();
        SortedSet<Integer> uniqueElements = new TreeSet<>();
        for (int num : nums){
            uniqueElements.add(num);
        }

        int count=0;
        for(int num : uniqueElements){
            nums[count++] = num;
        }

        return uniqueElements.size();
    }
}
