package org.example;

import org.example.object.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 17:05
 */
public class _429 {
    private List<List<Integer>> result = new ArrayList<>();

    private void order(Node node, int deep) {
        if (node == null) return;
        deep++;

        if (result.size() < deep) {
            result.add(new ArrayList<>());
        }

        result.get(deep-1).add(node.val);
        if (node.children != null) {
            for(Node child: node.children) {
                order(child, deep);
            }
        }

    }

    public List<List<Integer>> levelOrder(Node root) {
        order(root, 0);
        return result;
    }
    public static void main(String[] args) {
        Node _1 = new Node(1);
        Node _2 = new Node(2);
        Node _3 = new Node(3);
        Node _4 = new Node(4);
        Node _5 = new Node(5);
        Node _6 = new Node(6);

        _1.children = Arrays.asList(_3, _2, _4);
        _3.children = Arrays.asList(_5, _6);

        new _429().levelOrder(_1);
    }
}
