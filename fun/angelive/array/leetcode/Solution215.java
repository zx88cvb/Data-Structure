package fun.angelive.array.leetcode;

import java.util.Arrays;

/**
 * @author: Jingxiang Bi
 * @date: 2022/7/9
 */
public class Solution215 {

    public static void main(String[] args) {
        System.out.println(new Solution215().findKthLargest(new int[] {3,2,1,5,6,4}, 2));
    }
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargestThree(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
