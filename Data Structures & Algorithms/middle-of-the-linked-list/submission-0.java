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

        ListNode tail = head;
        int count = 0;
        while(tail != null){
            count++;
            tail = tail.next;
        }

        int mid = count/2;
        if(mid %2 == 0){
            // mid;
        }

        while(mid != 0){
            head = head.next;
            mid--;
        }

        return head;
        
    }
}