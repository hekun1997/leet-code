package org.example.forOffer;

import java.util.ArrayList;
import java.util.List;

public class _30 {
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
