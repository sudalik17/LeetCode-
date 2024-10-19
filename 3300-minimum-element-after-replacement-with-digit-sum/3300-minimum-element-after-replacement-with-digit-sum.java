class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
             s = digitsum(nums[i]);
            arr[i] = s;
             }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
        
    }
    private static int digitsum(int n){
        int sum = 0;
        while(n>0){
            sum = sum + (n%10);
            n = n/10;
            
        }
        return sum;
    }
}