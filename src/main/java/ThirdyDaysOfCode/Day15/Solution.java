package ThirdyDaysOfCode.Day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Day 15 of 30 days challenge
 */
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    static LinkedList<Node> list = new LinkedList<>();

    public static Node insert(Node head, int data) {

        if (list.isEmpty())
        list.add(new Node(data));
        else {
            Node node = new Node(data);
            list.getLast().next = node;
            list.add(node);
        }

        return list.getFirst();
    }
}
