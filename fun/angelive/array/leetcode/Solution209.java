package fun.angelive.array.leetcode;

/**
 * 209. 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 *
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：
 *
 * 输入：target = 4, nums = [1,4,4]
 * 输出：1
 * 示例 3：
 *
 * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-size-subarray-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: Jingxiang Bi
 * @date: 2022/7/10
 */
public class Solution209 {
    public static void main(String[] args) {
        int i = new Solution209().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        System.out.println(i);
    }
    public int minSubArrayLen(int target, int[] nums) {
        // 左右指针 [l....r]
        int l = 0, r = -1;
        int sum = 0;
        int length = nums.length + 1;

        while (l < nums.length) {
            if (r + 1 < nums.length && sum < target) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }

            if (sum >= target) {
                length = Math.min(length, r - l + 1);
            }
        }

        if (length == nums.length + 1) {
            return 0;
        }
        return length;
    }


    public int test(int target, int[] nums) {
        // 左右指针 [l....r]
        int l = 0, r = -1;
        int sum = 0;
        int length = nums.length + 1;

        while (l < nums.length) {
            if (r + 1 < nums.length && sum < target) {
                r++;
                sum += nums[r];
            } else {
                sum -= nums[l];
                l++;
            }

            if (sum >= target) {
                length = Math.min(length, r - l + 1);
            }
        }

        if (length == nums.length + 1) {
            return 0;
        }
        return length;
    }
}
