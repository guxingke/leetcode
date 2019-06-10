class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    if (x == 0) {
      return true;
    }

    // end zero
    if (x % 10 == 0) {
      return false;
    }

    if (x < 10) {
      return true;
    }

    char[] chars = String.valueOf(x).toCharArray();

    for (int i = 0; i < chars.length / 2 + 1; i++) {
      if (chars[i] != chars[chars.length - 1 - i]) {
        return false;
      }
    }

    return true;
  }
}
