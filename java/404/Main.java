public class Main {
  public static void main(String[] args) {
//    TreeNode root = TreeNode.stringToTreeNode("[0,2,4,1,null,3,-1,5,1,null,6,null,8]"); // 8
//    TreeNode root = TreeNode.stringToTreeNode("[-9,-3,2,null,4,4,0,-6,null,-5]"); // -11
    TreeNode root = TreeNode.stringToTreeNode("[3,9,20,null,null,15,7]"); //24
    Solution s = new Solution();
    int ret = s.sumOfLeftLeaves(root);
    System.out.println(ret);
  }
}
