

// Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


// Definition for a binary tree node.
 public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class linkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        // If the tree root is null, return false
        if (root == null) return false;

        // Check if the current root matches the linked list head,
        // or check in the left or right subtree
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    // Helper method for depth-first search to check if the linked list matches the path
    private boolean dfs(ListNode head, TreeNode node) {
        // If the linked list is fully traversed, return true
        if (head == null) return true;
        // If the node is null or values don't match, return false
        if (node == null || head.val != node.val) return false;

        // Continue searching in the left and right subtree
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }
}

