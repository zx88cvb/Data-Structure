package fun.angelive.array.leetcode;

import java.util.ArrayList;

/**
 * @Author angel
 * @Date 2021/6/2
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        // 创建一个非0集合
        ArrayList<Integer> nonZeros = new ArrayList<>();

        // 将非0元素放进集合
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZeros.add(nums[i]);
            }
        }

        // 将非0元素 依次赋值到原数组中
        for (int i = 0; i < nonZeros.size(); i++) {
            nums[i] = nonZeros.get(i);
        }

        // 将0赋值最后
        for (int i = nonZeros.size(); i < nums.length; i++) {
            nums[i] = 0;
        }


    }
}
