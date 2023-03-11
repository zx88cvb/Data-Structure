package fun.angelive.math.leetcode;

/**
 * @author: Jingxiang Bi
 * @date: 2022/12/9
 */
public class LeetCode1812 {
    public boolean squareIsWhite(String coordinates) {
        // x轴
        char x = coordinates.charAt(0);
        // y轴
        char y = coordinates.charAt(1);

        return (x+y) % 2 != 0;
    }
}
