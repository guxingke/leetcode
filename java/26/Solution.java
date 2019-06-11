class Solution {

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return 1;
    }

    int cur = 1;
    int preview = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      boolean eq = nums[i] == preview;
      if (!eq) {
        count++;
        preview = nums[i];
        nums[cur] = preview;
        cur++;
      }
    }
    return count;
  }

}

