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
    public boolean hasCycle(ListNode head) {
        int i = 0;
        ListNode current = head;
        Set<ListNode> seen = new HashSet<>();
        while (current != null) {
            if (seen.contains(current)) {
                return true;
            }
            seen.add(current);
            current = current.next;
            i++;
        }

        return false;
    }
}
