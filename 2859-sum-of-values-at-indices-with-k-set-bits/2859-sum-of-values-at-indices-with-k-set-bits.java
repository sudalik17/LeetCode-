class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int c=0;
            String str = Integer.toBinaryString(i);
            
              for(char ch:str.toCharArray()){
                  if(ch=='1')
                      c++;
              }
            if(c==k)
                sum = sum+nums.get(i);
            else 
                continue;
        }
        return sum;
    }
}