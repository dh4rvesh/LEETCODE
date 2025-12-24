class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum = 0;
            int temp = n;
            while(temp>0){
                sum+=(temp%10)*(temp%10);
                temp/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
