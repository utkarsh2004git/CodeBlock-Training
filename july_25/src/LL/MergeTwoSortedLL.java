package LL;

public class MergeTwoSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode();
        ListNode ans=dummy;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                dummy.next=temp1;
                temp1=temp1.next;
                dummy=dummy.next;
            }
            else{
                dummy.next=temp2;
                temp2=temp2.next;
                dummy=dummy.next;
            }
        }

        if(temp1!=null){
            dummy.next=temp1;
        }
        else{
            dummy.next=temp2;
        }
        return ans.next;
    }
}
