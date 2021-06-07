package fun.angelive.array.sort;

/**
 * 选择排序
 * @Author angel
 * @Date 2021/6/7
 */
public class Select {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        Select select = new Select();
        select.sort(arr);
        for (int item :
                arr) {
            System.out.println(item);
        }
    }

    /**
     * 排序
     * @param arr 数组
     * @return 排序后的数组
     */
    private int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
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
