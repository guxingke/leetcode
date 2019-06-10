public class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] input = {9, 9, 9};
    int[] out = s.plusOne(input);

    for (int i : out) {
      System.out.print(" " + i);
    }
  }
}
