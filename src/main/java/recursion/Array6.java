package recursion;

public class Array6 {
    public static void main(String[] args) {
        System.out.println(array6(new int[]{1, 2, 7 , 8}, 0));
    }
    static boolean array6(int[] nums, int index) {
        if (nums.length == index)
            return false;
        if (nums[index] == 6)
            return true;
        return array6(nums, index + 1);
    }
}
