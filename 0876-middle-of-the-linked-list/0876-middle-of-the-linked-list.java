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
    private int getLength(ListNode head){
        int l=0;
        while(head!=null){
            l++;
            head = head.next;
        }
        return l;
    }
    public ListNode middleNode(ListNode head) {
        int len = getLength(head);
        for(int i=0;i<(len/2);i++){
            head = head.next;
        }
        return head;
        
    }
}