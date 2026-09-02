class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        remove(s, 0, 0, new char[]{'(', ')'}, ans);
        return ans;
    }

    void remove(String s, int start, int check, char[] p, List<String> ans) {
        int count = 0;

        for (int i = check; i < s.length(); i++) {
            if (s.charAt(i) == p[0]) count++;
            if (s.charAt(i) == p[1]) count--;

            if (count < 0) {
                for (int j = start; j <= i; j++) {
                    if (s.charAt(j) == p[1] &&
                        (j == start || s.charAt(j - 1) != p[1])) {

                        remove(s.substring(0, j) + s.substring(j + 1),
                               j, i, p, ans);
                    }
                }
                return;
            }
        }

        String reversed = new StringBuilder(s).reverse().toString();

        if (p[0] == '(')
            remove(reversed, 0, 0, new char[]{')', '('}, ans);
        else
            ans.add(reversed);
    }
}
