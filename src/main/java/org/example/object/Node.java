package org.example.object;

import java.util.List;

/**
 * Created by hekun on 2023/2/20 17:06
 *         for (int i = 1; i < 6; i++) {
 *             Node _1 = new Node(1);
 *             System.out.println("Node _" + i + " = new Node("+ i +");");
 *         }
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
