class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
        {
            Arrays.sort(nums1);
            return;
        }
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i]; 
            }
            return;
        }
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}