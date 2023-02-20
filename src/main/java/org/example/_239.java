package org.example;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hekun on 2023/2/16 21:59
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回 滑动窗口中的最大值 。
 * 示例 1：
 * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出：[3,3,5,5,6,7]
 * 解释：
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * 示例 2：
 * 输入：nums = [1], k = 1
 * 输出：[1]
 * 提示：
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/sliding-window-maximum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        PriorityQueue deque = new PriorityQueue();
        for (int i = 0; i < nums.length; i++) {
            if (deque.size() == k) {
                result[index++] = deque.peek();
                deque.pop(nums[i - k]);
            }
            deque.push(nums[i]);
        }
        result[index] = deque.peek();
        return result;
    }
    public static void main(String[] args) {
//        int[] nums = new int[]{};
//        int k = 1;
//        int[] result = maxSlidingWindow(nums, k);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        queue.add(3);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class PriorityQueue {
    List<Integer> list = new LinkedList<>();
    public void pop(Integer data) {
        list.remove(data);
    }

    public void push(Integer data) {
        list.add(data);
        list.sort(Comparator.reverseOrder());
    }

    public int peek() {
        return list.get(0);
    }

    public int size() {
        return list.size();
    }
}
