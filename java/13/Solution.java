import java.util.HashMap;
import java.util.Map;

class Solution {

  Map<Character, Integer> m1 = new HashMap<>();

  {
    m1.put('M', 1000);
    m1.put('D', 500);
    m1.put('C', 100);
    m1.put('L', 50);
    m1.put('X', 10);
    m1.put('V', 5);
    m1.put('I', 1);
  }

  public int romanToInt(String str) {
    char[] chars = str.toCharArray();

    int sum = 0;
    for (int i = 0; i < chars.length; i++) {
      char a = chars[i];

      Integer r1 = m1.get(a);
      int ret = r1;
      if (i < chars.length - 1) {
        char b = chars[i + 1];
        Integer r2 = m1.get(b);
        if (r2 > r1) {
          i++;
          ret = r2 - r1;
        }
      }
      sum += ret;
    }

    return sum;
  }
}