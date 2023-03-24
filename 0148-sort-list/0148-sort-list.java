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
    

    public ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
	
    public ListNode merge(ListNode l1, ListNode l2) {
		if(l1==null) return l2;       
        if(l2==null) return l1;        
        ListNode ans = l1;           
        
	
        while(l2.val<l1.val) {
            ListNode temp = l1;
            l1=l2;
            l2=temp;
            ans=l1;
        }

        while(l1!=null && l2!=null) {
            ListNode temp = null;
            while(l1!=null && l1.val<=l2.val) {   
                temp = l1;
                l1=l1.next;
            }   
            temp.next = l2;
            temp = l1;
            l1=l2;
            l2=temp;
        }
        return ans;
    }
    
    public ListNode sortList(ListNode head) {
      
        if(head==null || head.next==null) return head;
        
      
        ListNode mid = findMid(head);
        
        ListNode left = head;
        ListNode right = mid.next;
        mid.next=null;
        
      
        left = sortList(left);
        right = sortList(right);
        
    
        ListNode ans  = merge(left,right);
        return ans;
    }
}