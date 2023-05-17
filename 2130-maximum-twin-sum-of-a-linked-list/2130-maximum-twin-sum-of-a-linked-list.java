/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode prevPtr = null;

     
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            ListNode nextNode = slowPtr.next;
            slowPtr.next = prevPtr;
            prevPtr = slowPtr;
            slowPtr = nextNode;
        }

        if (fastPtr != null) {
            slowPtr = slowPtr.next;
        }

        int max_Sum = Integer.MIN_VALUE;
        while (slowPtr != null) {
            max_Sum = Math.max(max_Sum, slowPtr.val + prevPtr.val);
            slowPtr = slowPtr.next;
            prevPtr = prevPtr.next;
        }
        return max_Sum;
    }
}