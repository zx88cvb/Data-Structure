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
}
