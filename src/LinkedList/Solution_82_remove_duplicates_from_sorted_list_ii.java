package LinkedList;

import com.company.ListNode;

public class Solution_82_remove_duplicates_from_sorted_list_ii {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while(cur.next!=null && cur.next.next!=null){
            if(cur.next.val == cur.next.next.val){
                int duplicateVal=cur.next.val;
                while(cur.next!=null && cur.next.val==duplicateVal){
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
