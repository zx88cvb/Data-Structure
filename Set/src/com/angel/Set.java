package com.angel;

/**
 * Set集合
 * @Author angel
 * @Date 19-7-2
 */
public interface Set<E> {
    /**
     * 添加元素
     * @param e 元素
     */
    void add(E e);

    /**
     * 删除元素
     * @param e 被删除的元素
     */
    void remove(E e);

    /**
     * 是否包含元素
     * @param e 元素
     * @return 是否包含
     */
    boolean contains(E e);

    /**
     * 元素个数
     * @return 个数
     */
    int getSize();

    /**
     * 是否为空
     * @return 是否为空
     */
    boolean isEmpty();
}
