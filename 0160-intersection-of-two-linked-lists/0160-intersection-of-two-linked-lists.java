/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getLength(ListNode node){
        int l=0;
        while(node!=null){
            l++;
            node = node.next;
        }
        return l;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int la = getLength(headA);
         int lb = getLength(headB);
        while(la>lb){
            headA = headA.next;
            la--;
        }
         while(lb>la){
            headB = headB.next;
            lb--;
        }
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
        
    }
}