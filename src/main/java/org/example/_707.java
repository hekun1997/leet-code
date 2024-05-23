package org.example;

import org.example.object.ListNode;

/**
 * @author hekun
 * @date 2024/5/21 16:39
 * @Description: TODO
 */
public class _707 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        myLinkedList.get(1);
        myLinkedList.deleteAtIndex(1);
        myLinkedList.get(1);
        myLinkedList.get(3);
        myLinkedList.deleteAtIndex(3);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
        myLinkedList.deleteAtIndex(0);
        myLinkedList.get(0);
    }
}

class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index > size-1) {
            return -1;
        }

        ListNode p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {

        if (index < 0) {
            index = 0;
        } else if(index > size) {
            return;
        }

        ListNode p = head;
        ListNode temp = new ListNode(val);

        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        size++;
        temp.next = p.next;
        p.next = temp;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head.next = head.next.next;
            size--;
            return;
        }

        ListNode p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }

        size--;
        p.next = p.next.next;
    }
}
