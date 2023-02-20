package org.example.forOffer;

import org.example.object.ListNode;

/**
 * Created by hekun on 2023/1/21 19:21
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为5的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * 示例 2:
 *
 * 输入: head = [4,5,1,9], val = 1
 * 输出: [4,5,9]
 * 解释: 给定你链表中值为1的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _18 {
    public static ListNode deleteNode(ListNode head, int val) {
        ListNode pre = head;
        if (head == null) {
            return head;
        }
        if (pre.val == val) {  // head val == val
            return pre.next;
        }
        while (pre != null && pre.next != null && pre.next.val != val) {
            pre = pre.next;
        }
        if (pre.next.val == val) {
            pre.next = pre.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node1 = new ListNode(1);
        ListNode node9 = new ListNode(9);

        node4.next = node5;
        node5.next = node1;
        node1.next = node9;

        ListNode result = deleteNode(null, 9);
        System.out.println(result);
    }
}
