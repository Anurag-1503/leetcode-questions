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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode dummyHead = dummy, start = dummy;

        outerLoop:
        while (true) {
            int i = 0;
            
            while (i++ != k) {
                if (dummyHead.next == null) {
                    break outerLoop;
                }

                head = head.next;
                dummyHead = dummyHead.next;
            }

            dummyHead.next = null;
            
            // this end pointer which is at the start now 
            // will reach the end after reversal
            ListNode end = start.next;  
            start.next = reverse(end);  // or reverse(start.next)

            start = dummyHead = end;
            end.next = head;
        }

        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}