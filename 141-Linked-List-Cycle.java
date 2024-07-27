/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //check if there's any null values
        if(head == null || head.next == null){
            return false;
        }
        //create two pointers 
        ListNode slow = head;
        ListNode fast = head.next;

        //if the pointers don't meet means keep checking 
        //otherwise return true because the pointers meet
        while(slow!=fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}