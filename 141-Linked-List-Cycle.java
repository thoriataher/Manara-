/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // use Floyd warshall algorithm--> in a nutshell I will have slow and fast
        // pointer and if they meet means
        // that I have a loop
        ListNode slow = head;
        if (slow == null)
            return false;

        ListNode fast = head.next;
        // check if there's any null values, I will return false
        // as long as it's a cycle means there's no null values
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // if the two pointers meet, I found a loop
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}