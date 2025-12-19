class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int oidx=0;
        int eidx=nums.length-1;
        while(oidx<eidx){
            if(nums[oidx]%2>nums[eidx]%2){
                int temp = nums[oidx];
                nums[oidx]=nums[eidx];
                nums[eidx]=temp;
            }
            if(nums[oidx]%2==0) oidx++;
            if(nums[eidx]%2==1) eidx--;
        }
        return nums;
    }
}
