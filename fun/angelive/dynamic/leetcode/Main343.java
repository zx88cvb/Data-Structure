package fun.angelive.dynamic.leetcode;

/**
 * @Author angel
 * @Date 2021/5/25
 */
public class Main343 {

    int[] memo;
    public static void main(String[] args) {
        Main343 main343 = new Main343();
        int i = main343.integerBreak(10);
        int dynamicR = main343.integerBreakDynamic(10);
        System.out.println(i);
        System.out.println(dynamicR);
    }

    /**
     * 记忆化搜索
     * @param n 数字
     * @return 最大乘积
     */
    public int integerBreak(int n) {
        memo = new int[n+1];
        return breakInteger(n);
    }

    private int breakInteger(int n) {
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, Math.max(i * (n - i), i * breakInteger(n-i)));
        }
        memo[n] = res;
        return memo[n];
    }


    /**
     * 动态规划
     * @param n 数字
     * @return 最大乘积
     */
    public int integerBreakDynamic(int n) {
        memo = new int[n+1];
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            // 求解memo[i]
            for (int j = 1; j < i; j++) {
                // j + (i - j)
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }
        return memo[n];
    }
}
