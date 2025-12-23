class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int x:nums1) map.put(x,1);
        for(int x:nums2){
            if(map.getOrDefault(x,0)==1){
                map.put(x,2);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                ans.add(entry.getKey());
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
