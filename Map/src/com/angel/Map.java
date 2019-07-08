package com.angel;

/**
 * @Author: Angel
 * @Date: 2019/7/8.
 * @Description:
 */
public interface Map<K, V> {
    /**
     * 添加
     * @param key key
     * @param value value
     */
    void add(K key, V value);

    /**
     * 删除
     * @param key key
     * @return value
     */
    V remove(K key);

    /**
     * 是否包含
     * @param key key
     * @return 是否包含
     */
    boolean contains(K key);

    /**
     * 获取value
     * @param key key
     * @return value
     */
    V get(K key);

    /**
     * 设置键值
     * @param key key
     * @param value value
     */
    void set(K key, V value);

    /**
     * 获取总个数
     * @return 个数
     */
    int getSize();

    /**
     * 是否为空
     * @return 是否为空
     */
    boolean isEmpty();
}
