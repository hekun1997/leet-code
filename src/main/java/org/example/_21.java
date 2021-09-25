package org.example;

import org.example.object.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * 
 *
 * 提示：
 *
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * Created by hekun on 2021/9/24 21:12
 */

public class _21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode();
        ListNode head = p;
        while (l1 != null || l2 != null){
            if (l1 == null && l2 != null){
                p.next = l2;
                return head.next;
            }

            if (l1 != null && l2 == null){
                p.next = l1;
                return head.next;
            }

            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists(arrayToListNode(Arrays.asList(1, 2, 4)), arrayToListNode(Arrays.asList(1, 3, 4))));
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
}