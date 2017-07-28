package ThirdyDaysOfCode.Day15;

import java.util.ArrayList;
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

    public static Node insert(Node head, int data) {

        if (head == null)
            head = new Node(data);
        else {
            head.next = new Node(data);

        }


        return head;
    }
}
