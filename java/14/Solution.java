import java.util.ArrayList;
import java.util.List;

class Solution {
  public String longestCommonPrefix(String[] strs) {

    if (strs == null || strs.length == 0) {
      return "";
    }

    int ml = Integer.MAX_VALUE;
    for (String str : strs) {
      if (str.length() < ml) {
        ml = str.length();
      }
    }

    List<Character> chars = new ArrayList<>();
    for (int i = 0; i < ml; i++) {
      char temp = strs[0].charAt(i);
      boolean pass = true;
      for (int i1 = 1; i1 < strs.length; i1++) {
        if (temp != strs[i1].charAt(i)) {
          pass = false;
        }
      }

      if (pass) {
        chars.add(temp);
      } else {
        break;
      }
    }

    if (chars.size() == 0) {
      return "";
    }

    StringBuilder sb = new StringBuilder();
    for (Character character : chars) {
      sb.append(character);
    }

    return sb.toString();
  }

}