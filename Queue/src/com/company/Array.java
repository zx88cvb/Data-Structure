package com.company;

public class Array<T> {
    private T[] data;

    private int size;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public Array(int capacity){
        data = (T[])new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    /**
     *  获取数组的容量
     * @return
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 返回数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向所有元素后添加一个新元素
     * @param e
     */
    public void addLast(T e){
        add(size,e);
    }

    /**
     * 在所有元素前添加一个新元素
     * @param e
     */
    public void addFirst(T e){
        add(0,e);
    }

    /**
     * 在index索引的位置插入一个新元素e
     * @param index 索引
     * @param e 元素
     */
    public void add(int index, T e){
        if ( index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
        }

        if ( data.length == size ) {
            resize(2 * data.length);
        }

        for ( int i = size-1; i >= index; i-- ){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    /**
     * 获取index索引位置的元素
     * @param index 索引
     * @return 返回元素
     */
    public T get(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        return data[index];
    }

    public T getFirts(){
        return get(0);
    }

    public T getLast(){
        return get(size - 1);
    }

    /**
     * 修改index索引位置的元素为e
     * @param index 索引
     * @param e 元素
     */
    public void set(int index, T e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = e;
    }

    /**
     * 查找数组中是否有元素e
     * @param e 元素
     * @return true or false
     */
    public boolean contains(T e){
        for(int i=0; i<size; i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    /**
     * 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
     * @param e
     * @return
     */
    public int find(T e){
        for(int i=0; i<size; i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    /**
     * 从数组中删除index位置的元素, 返回删除的元素
     * @param index
     * @return
     */
    public T remove(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }

        T ret = data[index];
        for(int i = index + 1;i<size;i++){
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;    // 把引用变为null  不写也行

        if(size == data.length / 4 && data.length / 2 != 0){    //防止复杂度的震荡
            resize(data.length / 2);
        }
        return ret;
    }

    /**
     * 从数组中删除第一个元素, 返回删除的元素
     * @return
     */
    public T removeFirst(){
        return remove(0);
    }

    /**
     * 从数组中删除最后一个元素, 返回删除的元素
     * @return
     */
    public T removeLast(){
        return remove(size-1);
    }

    // 从数组中删除元素e
    public void removeElement(T e){
        int index = find(e);
        if( index != -1 ){
            remove(index);
        }
    }


    private void resize(int newCapacity) {
        T[] newData = (T[])new Object[newCapacity];
        for(int i=0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for(int i=0; i<data.length;i++){
            res.append(data[i]);
            if(i != size-1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

}
