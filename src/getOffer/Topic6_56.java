package getOffer;

import java.util.Stack;

/**
 * 链表
 */
public class Topic6_56<E> {
    Node<E> first;
    Node<E> last;
    int size = 0;
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public void addToTail(E value) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(value, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    E unlink(Node<E> pre, Node<E> x) {
        E element = x.item;
        if (x == first) {
            first = x.next;
        } else if (x == last) {
            last = pre;
            last.next = null;
        } else {
            pre.next = x.next;
        }
        x.item = null;
        x.next = null; //help GC
        size--;
        return element;
    }

    public boolean removeNode(Object o) {
        Node<E> pre = first;
        if (o == null) {
            for (Node<E> x = first; x != null; pre = x, x = x.next) {
                if (x.item == null) {
                    unlink(pre, x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; pre = x, x = x.next) {
                if (x.item.equals(o)) {
                    unlink(pre, x);
                    return true;
                }
            }
        }
        return false;
    }

    public void printList() {
        for (Node<E> x = first; x != null; x = x.next)
            System.out.println(x.item);
    }

    public void printReversingly_Iteratively() {
        Stack<E> stack = new Stack<>();
        for (Node<E> x = first; x != null; x = x.next)
            stack.push(x.item);

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    public void printReversingly_Recursively(Node<E> x) {
        if (x != null) {
            if (x.next != null)
                printReversingly_Recursively(x.next);
        }
        System.out.println(x.item);
    }
    public static void main(String[] args) {
        Topic6_56<Integer> li = new Topic6_56<>();
        li.addToTail(1);
        li.addToTail(2);
        li.addToTail(3);
        li.addToTail(4);
        li.addToTail(5);
        li.printReversingly_Iteratively();
        li.printReversingly_Recursively(li.first);
//        li.printList();
//        System.out.println("===================");
//        li.removeNode(1);
//        li.printList();
//        System.out.println("===================");
//        li.removeNode(5);
//        li.printList();
//        System.out.println("===================");
//        li.removeNode(3);
//        li.printList();
    }
}
