import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {

  public String makeLargestSpecial(String src) {
    List<String> mem = new ArrayList<>();
    int temp = 0;
    int l = 1;
    int len = src.length();
    if (len == 2) {
      return src;
    }
    for (int i = 1; i < len - 1; i++) {
      char c = src.charAt(i);
      if (c == '1') {
        temp++;
      } else {
        temp--;
      }
      if (temp == 0) {
        String sub = src.substring(l, i + 1);
        mem.add(makeLargestSpecial(sub));
        l = i + 1;
      }
    }

    mem.sort(Comparator.reverseOrder());
    return "1" + String.join("", mem) + "0";
  }
}

