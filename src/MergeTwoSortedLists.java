/**
 * MergeTwoSortedLists
 *
 * @author Henry
 * @date 2020/05/01
 * <p>
 * Definition for singly-linked list.
 */
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1.next;
        }else{
            l2.next = mergeTwoLists(l2.next, l1);
            return l2.next;
        }
    }

}
