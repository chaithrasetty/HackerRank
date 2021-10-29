import java.util.Arrays;

public class SortedSquare {
    public static int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int k = len - 1;
        int[] ans = new int[len];
        while(left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(leftSq >= rightSq) {
                ans[k--] = leftSq;
                left++;
            }
            else if(rightSq > leftSq) {
                ans[k--] = rightSq;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
