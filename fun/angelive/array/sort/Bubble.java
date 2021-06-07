package fun.angelive.array.sort;

/**
 * 冒泡排序
 * @Author angel
 * @Date 2021/6/7
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        Bubble bubble = new Bubble();
        bubble.sort(arr);

        for (int item: arr) {
            System.out.print(item + "\t");
        }
    }

    /**
     * 冒泡排序
     * @param arr 数组
     * @return 排序后
     */
    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {  // -i 为了效率
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    /**
     * 交换位置
     * @param arr 数组
     * @param j 索引1
     * @param i 索引2
     */
    private void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
