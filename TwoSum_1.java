import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] sum = {2,7,11,15};
        int target = 18;

        TwoSum_1 tbh= new TwoSum_1();
        int[] arr = tbh.add(sum, target);

        System.out.println(Arrays.toString(arr));
//        for (int ar:arr){
//            System.out.println(ar);
//        }

    }
    public int[] add(int[] num, int target){
        for (int i=0; i< num.length; i++){
            for (int j=i+1; j< num.length; j++){
                if (num[i] + num[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return num;
    }

}
