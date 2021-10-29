import java.util.Arrays;

public class TwoSumArray {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                break;
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{++start, ++end};
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
