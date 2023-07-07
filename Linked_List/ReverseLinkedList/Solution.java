package Linked_List.ReverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummyNode = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = dummyNode;
            dummyNode = head;
            head = next;
        }
        return dummyNode;
    }
}
