package fun.angelive.array.binary;

/**
 * @Author angel
 * @Date 2021/6/2
 */
public class BinaryArray {

    public static void main(String[] args) {
        BinaryArray binaryArray = new BinaryArray();
        int i = binaryArray.binarySearch(new int[]{1, 2, 3, 5, 6, 7, 9}, 6);
        System.out.println(i);
    }
    /**
     * 二分查找元素
     * @param arr 数组
     * @param target 目标值
     * @return 索引
     */
    private int binarySearch(int[] arr, int target) {
        // 长度
        int length = arr.length;

        // [l, ...., r] 中寻找
        int l = 0, r = length - 1;

        while (l <= r) {
            // 中间索引
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearch2(int[] arr, int target) {
        // 长度
        int length = arr.length;

        // [l, ...., r] 中寻找
        int l = 0, r = length;

        while (l < r) {
            // 中间索引
            // 可能会溢出 所以不用 l + r
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return -1;
    }
}
