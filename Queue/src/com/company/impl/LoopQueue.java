package com.company.impl;

import com.company.Queue;

public class LoopQueue<E> implements Queue<E> {

    // 数组 存放数据
    private E[] data;

    //首个元素索引
    private int front;

    //空索引指向
    private int tail;

    //队列中 有多少元素
    private int size;

    public LoopQueue (int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue () {
        this(10);
    }

    public int getCapacity (){
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == front;
    }

    @Override
    public void enqueue(E e) {
        if((tail + 1) % data.length == front){  /*判断队列是否满*/
            resize(getCapacity() * 2);
        }

        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");

        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCapacity()/4 && getCapacity()/2 != 0){
            resize(getCapacity()/2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty.");
        return data[front];
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for(int i = front ; i != tail ; i = (i + 1) % data.length){
            res.append(data[i]);
            if((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }


    /**
     * 扩容 或 缩减 队列
     * @param newCapacity 新队列长度
     */
    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity + 1];
        for (int i = 0; i<size;i++){
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front=0;
        tail = size;
    }
}
