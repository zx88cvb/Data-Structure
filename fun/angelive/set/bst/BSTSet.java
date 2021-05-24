package fun.angelive.set.bst;

import fun.angelive.set.Set;

/**
 * 基于二分搜索树
 * @Author angel
 * @Date 19-7-2
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    /**
     * BST二分搜索树
     */
    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }
}
