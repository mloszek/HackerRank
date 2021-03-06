package ThirdyDaysOfCode.Day22;

import java.util.Scanner;


/**
 * Day 22 of 30 days challenge
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

        int height = getHeight(root);
        System.out.println(height);
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

    public static int getHeight(Node root) {

            return root == null ? -1 : (1 + myMax(getHeight(root.left), getHeight(root.right)));

    }

    public static int myMax (int a, int b){

        return (a > b) ? a : b;
    }
}

