class Solution {
  public int reverse(int x) {
    if (x == Integer.MIN_VALUE || x == 0) {
      return 0;
    }

    boolean negative = false;
    if (x < 0) {
      negative = true;
      x = x * -1;
    }

    while (x % 10 == 0) {
      x = x / 10;
    }

    if (x < 1000000000) {
      int temp = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
      if (negative) {
        return temp * -1;
      }
      return temp;
    }

    String rev = new StringBuilder(String.valueOf(x)).reverse().toString();

    if (negative && rev.compareTo("2147483648") > 0) {
      return 0;
    }

    if (rev.compareTo("2147483647") > 0) {
      return 0;
    }

    int temp = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
    if (negative) {
      return temp * -1;
    }
    return temp;
  }
}