import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateArray {
//    public static List<Integer> rotateLeft(int d, List<Integer> numbers) {
//
//        List<Integer> rotateArray = new ArrayList<>(5);
//        int n = numbers.size();
//        for(int i = 0; i < n; i++) {
//            rotateArray.add(numbers.get((i + d)%numbers.size()));
//        }
//
//        return rotateArray;
//
//    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] rotateArray = new int [n];
        for(int i=0; i<n;i++){
            int newIndex = (i+n-k)%n;
            rotateArray[newIndex] = nums[i];
        }
        System.out.println(Arrays.toString(rotateArray));
    }


    public static void main(String[] args) {
      //  List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
     //   System.out.println(rotateLeft(d, nums));
        rotate(nums,k);

    }
}
