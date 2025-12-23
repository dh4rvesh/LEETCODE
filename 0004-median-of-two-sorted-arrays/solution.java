class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merged = new int[m+n];
        int k=0;
        for(int i=0;i<m;i++){
            merged[k++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merged[k++]=nums2[i];
        }
        Arrays.sort(merged);
        return median(merged);
    }
    private double median(int[] arr){
        int n=arr.length;
        if(n%2==1){
           return (double) arr[n/2];
        }
        else{
            int mid1=arr[n/2 -1];
            int mid2=arr[n/2];
            return ((double) mid1 + (double) mid2)/2.0;
        }
    }
}
