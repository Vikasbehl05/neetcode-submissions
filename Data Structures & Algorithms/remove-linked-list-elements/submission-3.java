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
    public ListNode removeElements(ListNode head, int val) {
        // if(head == null)
        //     return head;
        // while (head.val == val && head != null) {
        //     if (head.next == null)
        //         return head.next;
        //     head = head.next;
        // }

        // ListNode temp = head;
        // ListNode prev = head;

        // while (temp != null) {
        //     if (temp.val != val) {
        //         prev = temp;
        //         temp = temp.next;
        //     } else {
        //         while (temp != null && temp.val == val) {
        //             temp = temp.next;
        //         }
        //         prev.next = temp;
        //         if (temp != null)
        //             temp = temp.next;
        //     }
        // }

        // return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}