package fun.angelive.dynamic.fib;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列
 * @Author angel
 * @Date 2021/5/24
 */
public class FibMain {

    private static Map<Integer, Integer> memoMap = new HashMap<>();
    public static void main(String[] args) {
        // 开始时间
        long startTime = System.currentTimeMillis();

        // 结果
        int result = fib(10);
        int result2 = fibDynamic(10);

        // 结束时间
        long elapsedTime = (System.currentTimeMillis() - startTime);

        System.out.println(String.format("result: %d 耗时:%d 秒", result, elapsedTime / 1000));
        System.out.println(String.format("result dynamic: %d 耗时:%d 秒", result2, elapsedTime / 1000));
    }

    /**
     * 自上而下解决 斐波那契数列 + 记忆化搜索
     * @param num 数字
     * @return 结果
     */
    private static int fib(int num) {
        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        if (!memoMap.containsKey(num)) {
            memoMap.put(num, fib(num - 1) + fib(num - 2));
        }

        return memoMap.get(num);
    }

    /**
     * 自下而上 动态规划解决斐波那契数列
     * @param num
     * @return
     */
    private static int fibDynamic(int num) {
        Map<Integer, Integer> map = new HashMap<>(){
            {
                put(0, 0);
                put(1, 1);
            }
        };

        for (int i = 2; i <= num; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }
        return map.get(num);
    }
}
