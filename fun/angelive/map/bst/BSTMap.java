package fun.angelive.map.bst;

import fun.angelive.map.Map;

/**
 * @Author angel
 * @Date 19-7-14
 */
public class BSTMap<K extends Comparable<K>, V> implements Map<K, V> {
    private class Node {
        public K key;
        public V value;
        public Node left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // 根节点
    private Node root;

    // 记录多少元素
    private int size;

    public BSTMap() {
        root = null;
        size = 0;
    }


    @Override
    public void add(K key, V value) {
        root = add(root, key, value);
    }

    // 以node为根的二分搜索树插入元素key value 递归算法(无重复元素)
    // 返回插入新节点后二分搜索树的根
    private Node add (Node node, K key, V value) {
        /*if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size ++;
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size ++;
            return;
        }*/

        if (node == null) {
            size ++;
            return new Node(key, value);
        }

        if (key.compareTo(node.key) < 0) {
            node.left = add(node.left, key, value);
        } else if (key.compareTo(node.key) > 0){
            node.right = add(node.right, key, value);
        } else {    // 存在key 直接覆盖原来的value
            node.value = value;
        }

        return node;
    }

    @Override
    public V remove(K key) {
        Node node = getNode(root, key);
        if (node != null) {
            root = remove(root, key);
            return node.value;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        Node node = getNode(root, key);
        return node != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(root, key);
        return node == null? null : node.value;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(root, key);
        if (node == null) {
            throw new IllegalArgumentException(key + "doesn't exist!");
        }

        node.value = value;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 返回以node为节点二分搜索树 key所在的节点
     * @param node node节点
     * @param key key
     * @return key所在的节点
     */
    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) == 0) {
            return node;
        } else if (key.compareTo(node.key) < 0){
            return getNode(node.left, key);
        } else {
            return getNode(node.right, key);
        }

    }

    /**
     * 删除以node为根二分搜索树中值为e的节点
     * @param node 节点
     * @param key key值
     * @return 新Node节点
     */
    private Node remove(Node node, K key) {
        if (node == null) {
            return null;
        }

        // 比较后小于0 说明删除的值在左子数
        if (key.compareTo(node.key) < 0) {
            node.left = remove(node.left, key);
            return node;
        } else if (key.compareTo(node.key) > 0) {
            node.right = remove(node.right, key);
            return node;
        } else {    // e==node.e
            // 待删除节点左子树为空情况
            if (node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return rightNode;
            }

            // 待删除节点右子树为空情况
            if (node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }

            // 左右子树均不为空
            // 找到比待删除节点大的最小节点，即待删除节点右子树最小节点
            // 利用这个节点顶替待删除节点

            // 找到右子树最小节点
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;
            return successor;

        }
    }

    /**
     * 返回以node为根的二分搜索树最小值节点
     * @param root 根节点
     * @return 最小值节点
     */
    private Node minimum(Node root) {
        if (root.left == null) {
            return root;
        }
        return minimum(root.left);
    }

    /**
     * 删除以node为根的最小值节点
     * @param root root为根节点
     * @return 新的二分搜索树根
     */
    private Node removeMin(Node root) {
        if (root.left == null) {
            // 保存右子数
            Node rightNode = root.right;
            // 删除
            root.right = null;
            size--;
            return rightNode;
        }
        root.left = removeMin(root.left);
        return root;
    }
}
