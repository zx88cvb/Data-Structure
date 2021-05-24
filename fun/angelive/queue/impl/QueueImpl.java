package fun.angelive.queue.impl;

import fun.angelive.queue.Array;
import fun.angelive.queue.Queue;

public class QueueImpl<E> implements Queue<E> {

    private Array<E> array;

    public QueueImpl(int capacity) {
        array = new Array<E>(capacity);
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    public QueueImpl() {
        array = new Array<E>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirts();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
