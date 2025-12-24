class Solution {
    public boolean isPalindrome(String s) {
        String s1 = "";

        for(Character ch : s.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                s1 += Character.toLowerCase(ch);
            }
        }

        return s1.equalsIgnoreCase(new StringBuilder(s1).reverse().toString());
    }
}
