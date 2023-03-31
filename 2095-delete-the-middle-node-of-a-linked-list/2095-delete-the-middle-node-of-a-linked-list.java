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
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode tail = head;
        while(tail!=null)
        {
            tail=tail.next;
            size++;
        }
        if(size == 1)
            return null;
        if(size == 2)
        {
            head.next = null;
            return head;
        }
      
        ListNode temp1 = head;
		ListNode temp2 = head.next;
		for(int i=1;i<size/2;i++)
		{
			temp1 = temp1.next;
			temp2=temp2.next;
		}
        
        temp1.next = temp2.next;
        
        return head;
   
        
    }
}