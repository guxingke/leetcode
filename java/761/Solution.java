import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {

  public String makeLargestSpecial(String src) {
    List<String> mem = new ArrayList<>();
    int temp = 0;
    int l = 0;
    int len = src.length();
    for (int i = 0; i < len; i++) {
      char c = src.charAt(i);
      if (c == '0') {
        temp--;
      } else {
        temp++;
      }

      if (temp == 0) {
        String sub = src.substring(l + 1, i);
        mem.add("1" + makeLargestSpecial(sub) + "0");
        l = i + 1;
      }
    }

    mem.sort(Comparator.reverseOrder());
    return String.join("", mem);
  }
}

