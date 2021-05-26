package fun.angelive.dynamic.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author angel
 * @Date 2021/5/26
 */
public class Main198 {
    int[] memo;
    public static void main(String[] args) {
        Main198 main198 = new Main198();
        int rob = main198.rob(new int[]{2,7,9,3,1});
        int rob2 = main198.rob2(new int[]{2,7,9,3,1});
        System.out.println(rob);
        System.out.println(rob2);
    }

    private int rob(int[] nums) {
        memo = new int[nums.length];
        return tryRob(nums, 0);
    }

    private int tryRob(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }

        if (memo[index] != 0) {
            return memo[index];
        }

        int res = 0;
        for (int i = index; i < nums.length; i++) {
             res = Math.max(res, nums[i] + tryRob(nums, i + 2));
        }
        memo[index] = res;
        return res;
    }

    /**
     * 动态规划
     * @param nums 给定数组
     * @return 最大收益
     */
    private int rob2(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] memo2 = new int[length];
        memo2[length - 1] = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i; j < length; j++) {
                memo2[i] = Math.max(memo2[i], nums[j] + (j + 2 >= length? 0: memo2[j + 2]));
            }
        }
        return memo2[0];
    }
}
