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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // Reverse the input linked lists
    l1 = reverseLinkedList(l1);
    l2 = reverseLinkedList(l2);

    ListNode dummyHead = new ListNode(0);
    ListNode current = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;

        int sum = x + y + carry;
        carry = sum / 10;
        int digit = sum % 10;

        current.next = new ListNode(digit);
        current = current.next;

        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }

    if (carry > 0) {
        current.next = new ListNode(carry);
    }

    // Reverse the result linked list
    return reverseLinkedList(dummyHead.next);
}

private ListNode reverseLinkedList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;

    while (current != null) {
        ListNode nextNode = current.next;
        current.next = prev;
        prev = current;
        current = nextNode;
    }

    return prev;
}
}