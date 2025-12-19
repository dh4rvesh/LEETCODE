class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i:nums){
            if(set.containsKey(i)){
                return true;
            }
            set.put(i,1);
        }
        return false;
    }
}
