class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(total<min){
                min=total;
            }
        }
        return -min+1;
    }
}
