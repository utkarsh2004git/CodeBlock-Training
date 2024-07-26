package LL;

public class deleteNode {
    public void deleteNode(ListNode node) {
        ListNode prev=node;
        ListNode nxt=node.next;
        prev.val=nxt.val;
        prev.next=nxt.next;

    }

}
