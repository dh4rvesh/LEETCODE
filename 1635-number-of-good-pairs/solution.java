class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        Map<Integer,Integer> numFreq = new HashMap<>();
        for(int num:nums){
            numFreq.put(num,numFreq.getOrDefault(num,0)+1);
        }
        for(int freq:numFreq.values()){
            count+=(freq*(freq-1))/2;
        }
        return count;
    }
}
