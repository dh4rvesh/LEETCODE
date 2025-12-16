class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int j=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            while(chars.contains(s.charAt(i))){
                chars.remove(s.charAt(j));
                j++;
            }
            chars.add(s.charAt(i));
            len=Math.max(len,i-j+1);
        }
        return len;
    }
}
