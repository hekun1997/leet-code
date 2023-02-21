package org.example;

import org.example.object.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hekun on 2023/2/20 19:25
 */
public class _116 {
    List<List<Node>> allData = new ArrayList<>();

    public void traverse(Node node, int deep) {
        if (node == null) return;

        deep++;
        if (allData.size() < deep) {
            allData.add(new ArrayList<>());
        }
        allData.get(deep-1).add(node);
        traverse(node.left, deep);
        traverse(node.right, deep);
    }

    public Node connect(Node root) {
        traverse(root, 0);
         for (List<Node> nodes: allData) {
             for (int i = 0; i < nodes.size()-1; i++) {
                nodes.get(i).next = nodes.get(i+1);
             }
         }
        return root;
    }
    public static void main(String[] args) {

    }
}
