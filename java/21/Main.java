public class Main {

  public static void main(String[] args) {
    Solution s = new Solution();

    ListNode l1 = ListNode.stringToListNode("[1,2,4]");
    ListNode l2 = ListNode.stringToListNode("[1,3,4]");
    ListNode node = s.mergeTwoLists(l1, l2);
    System.out.println(ListNode.listNodeToString(node));
  }
}
