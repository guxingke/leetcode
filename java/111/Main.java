public class Main {

  public static void main(String[] args) {
    Solution s = new Solution();
    int ret = s.minDepth(TreeNode.stringToTreeNode("[1,2,null,3,null,4,null,5]"));
    System.out.println(ret);
  }
}
