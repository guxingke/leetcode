class Solution {
  public int lengthOfLastWord(String s) {
    if (s == null) {
      return 0;
    }
    s = s.trim();
    if (s.isEmpty()) {
      return 0;
    }

    char[] chars = s.toCharArray();
    int count = 0;
    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[i] == ' ') {
        break;
      }
      count++;
    }
    return count;
  }
}