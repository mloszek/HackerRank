package ThirdyDaysOfCode.Day23;

import ThirdyDaysOfCode.Day22.Node;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Day 23 of 30 days challenge
 */
public class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;

        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }

        levelOrder(root);
    }

    public static Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static void levelOrder(Node root) {

        LinkedList<Node> queue = new LinkedList<>();

        if (root != null)
            queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.getFirst();
            queue.removeFirst();

            System.out.print(node.data + " ");

            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }
}
