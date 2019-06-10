class Solution {
  public int[] plusOne(int[] digits) {
    boolean carry = true;

    for (int i = digits.length - 1; i >= 0; i--) {
      if (!carry) {
        break;
      }

      int cur = digits[i] + 1;
      if (cur == 10) {
        carry = true;
        digits[i] = 0;
      } else {
        carry = false;
        digits[i] = cur;
      }
    }

    if (digits[0] != 0) {
      return digits;
    }

    int[] rets = new int[digits.length + 1];
    rets[0] = 1;

    System.arraycopy(digits, 0, rets, 1, digits.length);
    return rets;
  }
}