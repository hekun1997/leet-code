package org.example.forOffer;

/**
 * Created by hekun on 2023/1/12 15:07
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _35 {
    public static Node copyRandomList(Node head) {
        // copy source Node val
        for (Node curr = head, copy = null;
             curr != null;
             curr = curr.next.next) {
            copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
        }
        // copy source Node random val
        for (Node curr = head; curr != null; curr = curr.next.next) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
        }
        //split source Node
        //for (Node curr = head.next; curr != null && curr.next != null; curr = curr.next) {
        //curr.next = curr.next.next;
        //}
        for (Node node = head, temp = null; node != null && node.next != null;) {
            temp = node.next;
            node.next = temp.next;
            node = temp;
        }
        return head.next;
    }

    public static void main(String[] args) {
        // [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node node7 = new Node(7);
        Node node13 = new Node(13);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);

        node7.next = node13;
        node13.next = node11;
        node11.next = node10;
        node10.next = node1;

        node13.random = node7;
        node11.random = node1;
        node10.random = node11;
        node1.random = node7;

        copyRandomList(node7);
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                ", random=" + random +
                '}';
    }
}
