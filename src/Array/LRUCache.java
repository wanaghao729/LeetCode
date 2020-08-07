package src.Array;

import java.util.*;

public class LRUCache {

    class DLinkedNode {
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;
    }
    // 新增结点，结点永远在头节点的下一个
    private void addNode(DLinkedNode node) {
        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;
    }

    // 删除结点
    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    // 把中间节点移动到头节点之后
    private void moveToHead(DLinkedNode node) {
        if (node.pre == head)
            return;
        this.removeNode(node);
        this.addNode(node);
    }

    // 取出当前尾部节点--即删除
    private DLinkedNode popTail() {
        DLinkedNode res = tail.pre;
        this.removeNode(res);
        return res;
    }


    private HashMap<Integer, DLinkedNode> cache = new HashMap<>();
    private int count;  // 当前双向链表的节点数量
    private int capacity;   // 当前cache的容量
    private DLinkedNode head, tail; // 伪节点，防止溢出

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        head.pre = null;

        tail = new DLinkedNode();
        tail.next = null;

        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            // 其实应该抛异常
            return -1;
        }

        // 最近访问过的都应该在头部，所以移动到头部
        this.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);

        if (node == null) {
            DLinkedNode newNode = new DLinkedNode();
            newNode.key = key;
            newNode.value = value;
            this.cache.put(key, newNode);
            this.addNode(newNode);

            ++count;

            if (count > capacity) {
                // 移除尾节点
                DLinkedNode tail = this.popTail();
                this.cache.remove(tail.key);
                --count;
            }
        } else {
            // 更新值
            node.value = value;
            this.moveToHead(node);
        }
    }

    public DLinkedNode getTail() {
        return tail.pre;
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(100);
        for (int i = 1; i < 100; i++) {
            cache.put(i, i);
        }


//        Map<Integer, Integer> map  = new HashMap<>();
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.put(6, 6);
        System.out.println(cache.getTail().value);
//        map.forEach((K, V) -> {
//            System.out.println(K + " " + V);
//        });
    }
}
