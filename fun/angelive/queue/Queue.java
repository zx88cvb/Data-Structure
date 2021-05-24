package fun.angelive.queue;

public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    /**
     * 加入队列
     * @param e
     */
    void enqueue(E e);

    /**
     * 出列
     * @return
     */
    E dequeue();

    /**
     * 查看首个列
     * @return
     */
    E getFront();
}
