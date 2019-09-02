package com.angel;

/**
 * 堆
 * @Author angel
 * @Date 19-7-14
 */
public class MaxHeap<E extends Comparable<E>> {
    /**
     * 数组
     */
    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    /**
     * 返回堆中的元素个数
     * @return 元素个数
     */
    public int size() {
        return data.getSize();
    }

    /**
     * 是否为空
     * @return 是否为空
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 获取一个索引所表示元素的父节点索引
     * @param index 当前索引
     * @return 父节点索引
     */
    private int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index-0 doesn't have parent");
        }
        return (index - 1) / 2;
    }

    /**
     * 获取当前节点左孩子索引
     * @param index 当前索引
     * @return 左孩子索引
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    /**
     * 获取当前节点右孩子索引
     * @param index 当前索引
     * @return 右孩子索引
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }

    /**
     * 添加元素
     * @param e 待添加元素
     */
    public void add (E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    /**
     * 元素上浮
     * @param index 当前索引
     */
    private void siftUp(int index) {
        while (index > 0 && data.get(parent(index)).compareTo(data.get(index)) < 0) {
            data.swap(index, parent(index));
            index = parent(index);
        }
    }

    /**
     * 查询堆中最大元素
     * @return 最大元素值
     */
    public E findMax() {
        if (data.getSize() == 0) {
            throw new IllegalArgumentException("Can not findMax when heap is empty");
        }
        return data.get(0);
    }

    /**
     * 取出堆中最大元素
     * @return 元素值
     */
    public E extractMax() {
        E ret = findMax();

        // 交换位置
        data.swap(0, data.getSize() - 1);
        data.removeLast();

        siftDown(0);
        return ret;
    }

    /**
     * 元素下沉
     * @param index 索引
     */
    private void siftDown(int index) {
        while (leftChild(index) < data.getSize()) {
            // 获取当前节点的左孩子
            int i = leftChild(index);
            // 判断右孩子是否存在 且值是否大于左孩子
            if (i + 1 < data.getSize() && data.get(i + 1).compareTo(data.get(i)) > 0) {
                // 索引i赋值成右孩子的索引
                i = rightChild(index);
            }

            // 如果index 元素大于 i 则满足二叉堆的性质 直接跳出循环
            if (data.get(index).compareTo(data.get(i)) >= 0) {
                break;
            }

            // 交换位置
            data.swap(index, i);
            index = i;
        }
    }
}
