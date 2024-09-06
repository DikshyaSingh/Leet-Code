import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



public class linkedlist {
    public ListNode removeElements(ListNode head, int[] nums) {
        // Convert nums array to set for O(1) lookup
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        // Create a dummy node to handle edge cases (like removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the linked list
        while (current.next != null) {
            if (numsSet.contains(current.next.val)) {
                // Skip the node with value in nums
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        // Return the new head, which is the next of dummy node
        return dummy.next;
    }
}
