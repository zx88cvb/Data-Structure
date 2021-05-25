package fun.angelive.dynamic.leetcode;

/**
 * @Author angel
 * @Date 2021/5/24
 */
public class Main70 {
    public static void main(String[] args) {
        int i = climbStairs(3);
        System.out.println(i);
    }

    public static int climbStairs(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        if (n == 0 || n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
}
