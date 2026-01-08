class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if (n==0) return new ArrayList<>();
        if (n==1) return Arrays.asList(Arrays.asList(strs));
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
