class Solution {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (sb.length() != s.length() && i < words.length) {
            sb.append(words[i]);
            i++;
        }
        return sb.toString().equals(s);
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};

        isPrefixString(s, words);
    }
}
