import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<String> readBinaryWatch(int num) {
    List<String> rets = new ArrayList<>();
    for (int i = 0; i < 12; ++i) {
      for (int j = 0; j < 60; ++j) {
        if (Integer.bitCount((i << 6) | j) == num) {
          rets.add(i + ":" + (j > 9 ? "" : "0") + j);
        }
      }
    }
    return rets;
  }
}
