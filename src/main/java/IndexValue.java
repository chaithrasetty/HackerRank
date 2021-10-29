public class IndexValue {
    public static int search(int[] nums, int target) {
        int index = 0;

        for(int i=0; i < nums.length ; i++) {
            if(nums[i] == target) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
