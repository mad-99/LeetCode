public class Solution {
public ListNode reverseList(ListNode head) {
    if (head == null) {
        return null;
    }

    ListNode node = head,
            prev = null,
            reversed = null;

    while (node != null) {
        final ListNode next = node.next;

        if (node.next == null) {
            reversed = node;
        }
        node.next = prev;
        prev = node;
        node = next;
    }

    return reversed;
}
}
