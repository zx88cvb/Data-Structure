package fun.angelive.set.linked;

import fun.angelive.set.Set;

/**
 * 基于链表实现Set集合
 * @Author angel
 * @Date 19-7-2
 */
public class LinkedListSet<E> implements Set<E> {
    private LinkedList<E> list;

    public LinkedListSet() {
        list = new LinkedList<>();
    }

    @Override
    public void add(E e) {
        if (!list.contains(e)) {
            list.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
