package LL;
import java.util.*;
public class ReverseLL {
    public static ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;

        }
        head=prev;
        return head;
    }
    public static void main(String[] args) {

    }
}
