package fun.angelive.linked;

/**
 * 链表
 */
public class LinkedList<E> {

    // 虚拟节点
    private Node dummyhead;

    //链表元素个数
    private int size;

    public LinkedList() {
        dummyhead = new Node(null, null);
        size = 0;
    }

    /**
     * 私有内部类
     */
    private class Node {
        public E e;

        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    // 返回链表元素个数
    public int getSize(){
        return size;
    }

    // 判断链表是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 在链表的index位置添加新元素E (不常用)
    public void add(int index, E e) {
        if (index < 0 || index > size){
            throw new IllegalArgumentException("add failed. Illegal index.");
        }

        Node prev = dummyhead;
        for (int i = 0; i < index; i++){
            prev = prev.next;
        }
        /*Node node = new Node(e);
        node.next = prev.next;
        prev.next = node;*/
        prev.next = new Node(e, prev.next);

        size ++;
    }

    // 在链表头添加元素E
    public void addFirst(E e) {
        /*Node node = new Node(e);
        node.next = head;
        head = node;*/

        //head = new Node(e, head);

        add(0, e);
    }

    // 在链表末尾添加元素
    public void addLast(E e) {
        add(size, e);
    }

    // 获取链表中index个元素 (不常用)
    public E get(int index) {
        if (index < 0 || index > size){
            throw new IllegalArgumentException("get failed. Illegal index.");
        }

        //遍历链表
        Node cur = dummyhead.next;
        for (int i=0; i<index;i++){
            cur = cur.next;
        }

        return cur.e;
    }

    /**
     * 获取链表第一个元素
     * @return 返回元素
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获取链表最后一个元素
     * @return 返回元素
     */
    public E getLast() {
        return get(size-1);
    }

    /**
     * 修改链表第index元素 (不常用)
     * @param index 索引
     * @param e 修改值
     */
    public void set(int index, E e) {
        if (index < 0 || index > size){
            throw new IllegalArgumentException("set failed. Illegal index.");
        }

        Node cur = dummyhead.next;
        for (int i=0; i<index;i++){
            cur = cur.next;
        }
        cur.e = e;
    }

    /**
     * 查找链表中是否有元素e
     * @param e 被查找元素
     * @return true or false
     */
    public boolean contains(E e) {
        Node cur = dummyhead.next;
        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 根据索引删除元素
     * @param index 索引
     * @return 返回删除元素
     */
    public E remove (int index) {
        if (index < 0 || index > size){
            throw new IllegalArgumentException("remove failed. Illegal index.");
        }
        Node prev = dummyhead;
        for (int i = 0; i < index; i ++) {
            prev = prev.next;
        }
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size --;

        return retNode.e;
    }

    /**
     * 删除链表中第一个元素
     * @return 返回删除元素
     */
    public E removeFirst () {
        return remove(0);
    }

    /**
     * 删除链表中最后一个元素
     * @return 返回删除元素
     */
    public E removeLast () {
        return remove(size-1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = dummyhead.next;
        while (cur != null) {
            sb.append(cur + "->");
            cur = cur.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}
