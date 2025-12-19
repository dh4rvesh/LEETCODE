class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> a = new HashSet<>();
        for(int i:nums){
            a.add(i);
        }
        List<Integer> l1 = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                l1.add(i);
            }
        }
        return l1;
    }
}
