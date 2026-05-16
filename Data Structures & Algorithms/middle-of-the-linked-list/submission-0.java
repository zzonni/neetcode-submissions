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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            arr.add(current);
            current = current.next;
        }

        return arr.get(arr.size() / 2);

    }
}