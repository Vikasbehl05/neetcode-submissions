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
    public ListNode middleNode(ListNode head) {

        // ListNode tail = head;
        // int count = 0;
        // while(tail != null){
        //     count++;
        //     tail = tail.next;
        // }

        // int mid = count/2;

        // while(mid != 0){
        //     head = head.next;
        //     mid--;
        // }

        // return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null   && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        
    }
}