package ThirdyDaysOfCode.Day24;

import java.util.Scanner;

/**
 * Day 24 of 30 days challenge
 */
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

    public static Node removeDuplicates(Node head) {

        if (head == null)
            return null;

        Node node = head.next;
        Node tempNode = head;
        int temp = head.data;

        while (node != null){
            if (node.data == temp){
                tempNode.next = null;
                node = node.next;
            }
            else {
                tempNode.next = node;
                tempNode = node;
                temp = node.data;
                node = node.next;
            }
        }

        return head;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
