
//   Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr = node.next;

        // copy the value of next node to current node && copy the .Next (address) of
        // next to current

        node.val = ptr.val;
        node.next = ptr.next;
        ptr = null; // important step to make code faster
    }
}