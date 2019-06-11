public class Main {

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int i = s.removeElement(nums, 2);

    for (int i1 = 0; i1 < i; i1++) {
      System.out.print(nums[i1] + " ");
    }

    System.out.println();
    System.out.println(i);
  }
}
