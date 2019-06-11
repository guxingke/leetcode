class Solution {

  public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
      return 0;
    }

    int cur = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      boolean eq = nums[i] == val;
      if (!eq) {
        if (cur != i) {
          nums[cur] = nums[i];
        }
        count++;
        cur++;
      }
    }
    return count;
  }

}

