package org.example.forOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _30 {
    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
     * 示例
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.min();   --> 返回 -3.
     * minStack.pop();
     * minStack.top();      --> 返回 0.
     * minStack.min();   --> 返回 -2.
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        //["MinStack","push","push","push","min","pop","min"]
        //[[],[0],[1],[0],[],[],[]]
         MinStack obj = new MinStack();
         obj.push(0);
         obj.push(1);
         obj.push(0);
        System.out.println(obj.min());
        obj.pop();
        System.out.println(obj.min());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

class MinStack {
    private List<Integer> data;
    private List<Integer> minData;

    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
        minData = new ArrayList<>();
    }

    public void push(int x) {
        if (minData.size() < 1) {
            minData.add(x);
        } else {
            if ( minData.get( minData.size() - 1 ) >= x ) {
                minData.add(x);
            }
        }
        data.add(x);
    }

    public void pop() {
        int removeValue = data.get(data.size() - 1);
        if (removeValue == minData.get( minData.size() - 1 )) {
            minData.remove( minData.size() - 1 );
        }
        data.remove(data.size() - 1);
    }

    public int top() {
        return data.get(data.size() - 1);
    }

    public int min() {
        return minData.get( minData.size() - 1 );
    }
}
