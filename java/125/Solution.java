class Solution {

  public boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toLowerCase().toCharArray()) {
      if (Character.isLowerCase(c) || Character.isDigit(c)) {
        sb.append(c);
      }
    }
    String lowcaseStr = sb.toString();
    if (lowcaseStr.isEmpty()) {
      return true;
    }

    if (lowcaseStr.length() == 1) {
      return true;
    }

    char[] chars = lowcaseStr.toCharArray();
    int length = chars.length;
    for (int i = 0; i < length / 2 + 1; i++) {
      if (chars[i] != chars[length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}

