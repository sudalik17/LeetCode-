class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            int n = nums[i];
            String str = Integer.toString(nums[i]);
            if(str.length()==1)
                sum = sum + Integer.parseInt(str);
            else{
                while(n>0){
                    max = Math.max(max,n%10);
                    n=n/10;
                }
                int k=0;
                String s="";
                while(k < str.length()){
                    s = s + Integer.toString(max);
                    k++;
                }
                sum= sum+Integer.parseInt(s);
            }
            
        }
        return sum;
    }
}