class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;
        int maxcount=0;
        for(int i:nums){
            if(i==1){
                currcount++;
                maxcount=Math.max(maxcount,currcount);
            }
            else{
                currcount=0;
            }
        }
        return maxcount;
    }
}
