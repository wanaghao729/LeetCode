//package src.swordMeansOffer;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Topic_35 {
//    public Node copyRandomList(Node head) {
//        if (head == null)   return null;
//        Node newNode = new Node(head.val);
//        Node tmp = newNode;
//        Map<Node, Node> map = new HashMap<>();
//        map.put(head, tmp);
//
//        while (head.next != null) {
//            head = head.next;
//            tmp.next = new Node(head.val);
//            tmp = tmp.next;
//            map.put(head, tmp);
//        }
//        tmp.next = null;
//
//        for (Node key : map.keySet()) {
//            map.get(key).random = map.get(key.random);
//        }
//        return newNode;
//    }
//}
//
//class Node {
//    int val;
//    Node next;
//    Node random;
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
