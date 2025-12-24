class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) {
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> resl = new ArrayList<>();
        for(int i:nums1){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(freq.getOrDefault(i,0)>0){
                resl.add(i);
                freq.put(i,freq.get(i)-1);
            }
        }
        int[] res = new int[resl.size()];
        for(int i=0;i<resl.size();i++){
            res[i] = resl.get(i);
        }
        return res;
    }
}
