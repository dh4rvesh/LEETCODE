class Solution {
    public String reverseVowels(String s) {
        char[] res=s.toCharArray();
        int i=0,j=res.length-1;
        while(i<j){
            while(i<j && !isvowel(res[i])){
                i++;
            }
            while(i<j && !isvowel(res[j])){
                j--;
            }
            char temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;
            j--;
        }
        return new String(res);

    }
    private boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
