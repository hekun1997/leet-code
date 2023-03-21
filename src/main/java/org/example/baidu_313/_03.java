package org.example.baidu_313;

import java.util.*;

/**
 * Created by hekun on 2023/3/13 19:41
 */
public class _03{
    public int colorBlockCount(Node node) {
        if (node == null) {
            return 0;
        }
        int res = 1;
        Deque<Node> deque = new LinkedList<>();
        deque.addLast(node);
        while (!deque.isEmpty()) {
            for (int i = deque.size(); i > 0; i--) {
                Node curr = deque.removeFirst();
                if (curr.left != null) {
                    if (!Objects.equals(curr.color, curr.left.color)) {
                        res++;
                    }
                    deque.addLast(curr.left);
                }
                if (curr.right != null) {
                    if (!Objects.equals(curr.color, curr.right.color)) {
                        res++;
                    }
                    deque.addLast(curr.right);
                }
            }
        }
        return res;
    }

    public int solution(Node root) {
        // 连通块总数不变，计算一个子树的连通块数量就可以确定另一个
        // l + r = sum, l, sum - l, sum - 2l.
        // 跟父亲的颜色相同，sum+1
        // 跟父亲的颜色不同，sum不变
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        int res = 0;
        int colorBlockCount = colorBlockCount(root);
        Deque<Node> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            Node curr = deque.removeFirst();
            if (curr.left == null && curr.right == null) {
                continue;
            }
            // delete left
            if (curr.left != null) {
                int leftCount = colorBlockCount(curr.left);
                if (Objects.equals(curr.color, curr.left.color)) {
                    if (leftCount * 2 > (colorBlockCount + 1)) {
                        leftCount = colorBlockCount + 1 - leftCount;
                    }
                    res += (colorBlockCount + 1) - 2 * leftCount;  // 3 - 2*1;
                } else {
                    if (leftCount * 2 > colorBlockCount) {
                        leftCount = colorBlockCount - leftCount;
                    }
                    res += (colorBlockCount) - 2 * leftCount;
                }
                deque.addLast(curr.left);
            }
            // delete right
            if (curr.right != null) {
                int rightCount = colorBlockCount(curr.right);
                if (Objects.equals(curr.color, curr.right.color)) {
                    if (rightCount * 2 > (colorBlockCount + 1)) {
                        rightCount = colorBlockCount + 1 - rightCount;
                    }
                    res += (colorBlockCount + 1) - 2 * rightCount;  // 3 - 2*1;
                } else {
                    if (rightCount * 2 > colorBlockCount) {
                        rightCount = colorBlockCount - rightCount;
                    }
                    res += (colorBlockCount) - 2 * rightCount;
                }
                deque.addLast(curr.right);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String colors = scanner.next();
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            Node node = new Node(i);
            node.color = String .valueOf(colors.charAt(i-1));
            map.put(i, node);
        }
        Node root = map.get(1);
        for (int i = 0; i < n-1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Node parent = null;
            Node child = null;
            if (u < v) {
                parent = map.get(u);
                child = map.get(v);
            } else {
                parent = map.get(v);
                child = map.get(u);
            }

            if (parent.left == null) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        }

        System.out.println(new _03().solution(root));
    }
}

class Node {
    int value;
    Node left, right;
    String color;
    public Node() {

    }

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
