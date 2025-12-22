class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        int msum =0;
        for(int i:nums){
            msum+=i;
        }
        return sum-msum;
    }
}
