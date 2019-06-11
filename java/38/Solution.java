class Solution {

  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }

    String temp = "1";
    for (int i = 2; i <= n; i++) {
      temp = say(temp);
    }

    return temp;
  }

  private String say(String preview) {
    if (preview.length() == 1) {
      return "11";
    }

    char[] chars = preview.toCharArray();
    char temp = chars[0];

    StringBuilder sb = new StringBuilder();

    int count = 1;
    for (int i = 1; i < chars.length; i++) {
      if (temp != chars[i]) {
        sb.append(count);
        sb.append(temp);

        temp = chars[i];
        count = 1;
      } else {
        count++;
      }
    }

    sb.append(count);
    sb.append(temp);

    return sb.toString();
  }
}

