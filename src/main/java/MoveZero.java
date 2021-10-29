import java.util.Arrays;

public class MoveZero {
    public static int[] moveZeroes(int[] nums) {
        int ans [] = new int [nums.length];
        int k= 0;
        int len = nums.length-1;
        for(int i=0;i < nums.length; i++){
            if(nums[i] != 0) {
                ans[k++] = nums[i];
            } else {
                ans[len--] = nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
