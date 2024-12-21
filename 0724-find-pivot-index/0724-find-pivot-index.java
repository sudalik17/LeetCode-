class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum = sum+nums[i];
        int csum=0;
        for(int i=0;i<nums.length;i++){
            if(sum-(nums[i]+csum)==csum)
                return i;
            csum = csum+nums[i];
        }
        return -1;
        
    }
}