class Solution {
    public boolean isValid(String s) {
        // Stack<Character> par = new Stack();
        // int n = s.length();

        // for (int i = 0; i < n; i++) {
        //     if (s.charAt(i) == '{' || '(' || '[') {
        //         par.push(s.charAt(i));
        //     } else {
        //         if (par.empty())
        //             return false;

        //         char top = par.top();
        //         par.pop();

        //         if ((ch == ')' && top != '(') || (ch == '}' && top != '{')
        //             || (ch == ']' && top != '[')) {
        //             return false;
        //         }
        //     }
        // }

         Stack<Character> stack = new Stack<>();

         for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check closing brackets
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack should be empty if all brackets are matched
        return stack.isEmpty();
    }
}
