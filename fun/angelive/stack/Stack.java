package fun.angelive.stack;

/**
 * 栈
 * @param <E>
 */
public interface Stack<E> {

    /**
     *
     * @return
     */
    int getSize();

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 栈添加元素
     * @param e
     */
    void push(E e);

    /**
     * 取出元素
     * @return
     */
    E pop();

    /**
     * 查看栈顶元素
     * @return
     */
    E peek();
}
