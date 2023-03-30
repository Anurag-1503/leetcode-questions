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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode prev1 = head;
        ListNode prev2 = head;
        ListNode tail = head;
        int length=0;
        while(tail!=null)
        {
            tail=tail.next;
            length++;
        }
        
        for(int i=1;i<k;i++)
        {
            prev1=prev1.next;
        }
        for(int i=1;i<length-k+1;i++)
        {
            prev2=prev2.next;
        }
        
        int temp=prev1.val;
        prev1.val=prev2.val;
        prev2.val=temp;
        
        return head;
        
    }
}