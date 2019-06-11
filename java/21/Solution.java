class Solution {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode root = new ListNode(-1);
    merge(root, l1, l2);
    return root.next;
  }

  private void merge(ListNode root, ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return;
    }

    if (l1 == null) {
      root.next = l2;
      return;
    }

    if (l2 == null) {
      root.next = l1;
      return;
    }

    if (l1.val <= l2.val) {
      ListNode node = new ListNode(l1.val);
      root.next = node;
      merge(node, l1.next, l2);
    } else {
      ListNode node = new ListNode(l2.val);
      root.next = node;
      merge(node, l1, l2.next);
    }
  }
}

