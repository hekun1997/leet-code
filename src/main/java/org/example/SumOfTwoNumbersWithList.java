package org.example;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
 *输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
     Integer val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SumOfTwoNumbersWithList {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int multiple = 1;
        BigInteger sum = new BigInteger("0");
        while (l1 != null){
            sum = sum.add(new BigInteger(String.valueOf(l1.val * multiple)));
            l1 = l1.next;
            multiple *= 10;
        }

        multiple = 1;
        while (l2 != null){
            sum = sum.add(new BigInteger(String.valueOf(l2.val * multiple)));
            l2 = l2.next;
            multiple *= 10;
        }

        ListNode ret = new ListNode();
        ret.val = (int) (sum.longValue() % 10);

        ListNode curr = ret;

        sum = sum.divide(new BigInteger("10"));

        while (sum.longValue() > 0){
            ListNode temp = new ListNode();
            temp.val = (int) (sum.longValue() % 10);
            sum = sum.divide(new BigInteger("10"));
            curr.next = temp;
            curr = curr.next;
        }

        return ret;
    }

    public static ListNode arrayToListNode(List<Integer> datas){
        ListNode ret = new ListNode(datas.get(0));
        if (datas.size() == 1){
            return ret;
        }
        ListNode curr = ret;

        for (int i = 1; i < datas.size(); i ++){
            ListNode temp = new ListNode(datas.get(i));
            curr.next = temp;
            curr = curr.next;
        }

        return ret;
    }

    public static void main(String[] args) {
        addTwoNumbers(arrayToListNode(Arrays.asList(9)), arrayToListNode(Arrays.asList(1, 9, 9, 9, 9, 9, 9, 9, 9, 9)));
    }
}
