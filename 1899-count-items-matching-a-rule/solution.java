class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
      int n = items.size();
      int total = 0;
      int col_val = ("type".equals(ruleKey)?0:("color".equals(ruleKey)?1:2));
      for(int row = 0; row<n; row++){
        if(items.get(row).get(col_val).equals(ruleValue)){
            total++;
        }
      }
      return total;  
    }
}
