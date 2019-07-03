import java.util.List;

public class Main {
  public static void main(String[] args) {

    int[] nums = {1,-1,-1,0};
    Solution solution = new Solution();
    List<List<Integer>> lists = solution.threeSum(nums);

    System.out.println(lists);
  }
}
