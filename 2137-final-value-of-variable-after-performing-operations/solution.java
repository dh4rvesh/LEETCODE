class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for(String s:operations){
            x+=(44-s.charAt(1));
        }
        return x;
    }
}
