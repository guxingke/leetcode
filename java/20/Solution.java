import java.util.Stack;

class Solution {
  public boolean isValid(String str) {
    if (str == "") {
      return true;
    }

    if (str.length() % 2 != 0) {
      return false;
    }

    char[] chars = str.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '{') {
        stack.push('}');
      } else if (chars[i] == '[') {
        stack.push(']');
      } else if (chars[i] == '(') {
        stack.push(')');
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        Character pop = stack.pop();
        if (pop != chars[i]) {
          return false;
        }
      }
    }
    if (!stack.isEmpty()) {
      return false;
    }

    return true;
  }
}