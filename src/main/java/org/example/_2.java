package org.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import org.example.object.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: hekun
 * @date: 2024/7/25 17:08
 */
public class _2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        // if sum result more than 10, set carry = true
        boolean carry = false;
        while (l1 != null && l2 != null) {
            curr.val = l1.val + l2.val;
            if (carry) {
                curr.val += 1;
                carry = false;
            }
            if (curr.val >= 10) {
                curr.val %= 10;
                carry = true;
            }
            // move
            l1 = l1.next;
            l2 = l2.next;
            curr.next = new ListNode();
            curr = curr.next;
        }

        // remain list node
        while (l1 != null) {
            curr.val = l1.val;
            if (carry) {
                curr.val += 1;
                carry = false;
            }
            if (curr.val >= 10) {
                curr.val %= 10;
                carry = true;
            }
            // move
            l1 = l1.next;
            curr.next = new ListNode();
            curr = curr.next;
        }
        while (l2 != null) {
            curr.val = l2.val;
            if (carry) {
                curr.val += 1;
                carry = false;
            }
            if (curr.val >= 10) {
                curr.val %= 10;
                carry = true;
            }
            // move
            l2 = l2.next;
            curr.next = new ListNode();
            curr = curr.next;
        }
        if (carry) {
            curr.val = 1;
        }

        return head;
    }


    @Test
    public void testCase1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode result = addTwoNumbers(l1, l2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (expected != null && result != null) {
            arr1.add(expected.val);
            arr2.add(result.val);
            expected = expected.next;
            result = result.next;
        }
        Assert.assertEquals(arr1, arr2);
    }

    @Test
    public void testCase2() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode expected = new ListNode(5, new ListNode(7, new ListNode(9)));
        ListNode result = addTwoNumbers(l1, l2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (expected != null && result != null) {
            arr1.add(expected.val);
            arr2.add(result.val);
            expected = expected.next;
            result = result.next;
        }
        Assert.assertEquals(arr1, arr2);
    }

    @Test
    public void testCase3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode l2 = new ListNode(1);
        ListNode expected = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))));
        ListNode result = addTwoNumbers(l1, l2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (expected != null && result != null) {
            arr1.add(expected.val);
            arr2.add(result.val);
            expected = expected.next;
            result = result.next;
        }
        Assert.assertEquals(arr1, arr2);
    }

    @Test
    public void testCase4() {
        ListNode l1 = ListNode.createListWithArr(Arrays.asList(9,9,9,9,9,9,9));
        ListNode l2 = ListNode.createListWithArr(Arrays.asList(9,9,9,9));
        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        ListNode result = addTwoNumbers(l1, l2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        while (expected != null && result != null) {
            arr1.add(expected.val);
            arr2.add(result.val);
            expected = expected.next;
            result = result.next;
        }
        Assert.assertEquals(arr1, arr2);
    }

}
